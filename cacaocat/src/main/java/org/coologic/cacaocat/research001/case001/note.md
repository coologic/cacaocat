# 字节码编译命令及基础解析
BytecodeTestMeta 元类构建完成
直接运行成功
class 自动编译成功：cacaocat/build/classes/java/main/org/coologic/cacaocat/research001/case001/BytecodeTestMeta.class

那么开始进行字节码的解析逻辑开发，目标：

## 查询字节码信息
命令行 cd 到build目录下对应的 class 文件执行：`javap -v BytecodeTestMeta.class`


## class 解析
中的基本信息类名、包含的所有方法等
注意这里不是要动态加载class

一个class字节码包含的信息比较多，实体中字段内容会很多，解析逻辑也较为复杂，所以构建一个工厂专门进行解析

一个class的格式：[class_file](https://docs.oracle.com/javase/specs/jvms/se16/html/jvms-4.html)
。文档中的 u1、u2、u4、u8 代表字节数量分别为1、2、4、8。原始字段名称及注释已标注如下：
``` java
ClassFile {
    u4             magic;  //魔数 
    u2             minor_version;  //副版本号
    u2             major_version; //主版本号
    u2             constant_pool_count;  //常量池数量
    cp_info        constant_pool[constant_pool_count-1]; //常量池
    u2             access_flags;  //访问标志
    u2             this_class;  //类索引
    u2             super_class;  //父类索引
    u2             interfaces_count;  //接口索引数量
    u2             interfaces[interfaces_count];  //接口索引
    u2             fields_count;  //字段数量
    field_info     fields[fields_count];  //字段
    u2             methods_count;  //方法数量
    method_info    methods[methods_count]; //方法
    u2             attributes_count;  //属性数量
    attribute_info attributes[attributes_count];  //属性
}
```
很遗憾没有遇到捷径，我们想要的查到方法调用关系，那就需要解析出 method_info，由于二进制文件是顺序存储的，所以必须把前面的都正确解析出来，否则没法拿到正确的方法信息，既然已经走到了 method_info 那就一口气全解析了吧

同理找到 [cp_info](https://docs.oracle.com/javase/specs/jvms/se16/html/jvms-4.html#jvms-4.4)、[field_info](https://docs.oracle.com/javase/specs/jvms/se16/html/jvms-4.html#jvms-4.5)、[method_info](https://docs.oracle.com/javase/specs/jvms/se16/html/jvms-4.html#jvms-4.6)、[attribute_info](https://docs.oracle.com/javase/specs/jvms/se16/html/jvms-4.html#jvms-4.7)文档，确定数据结构

这样所有数据都会最终映射成基本类型，先确定一下类型关系：

| 字节码类型  | 我的类型 |      说明      |
| :--------: | :------: | :-----------------: | 
| u8 |    long     |  | 
| u4 |    int     |  | 
| u2 |    int     | 不考虑空间占用 | 
| u1 |     int    | 不考虑空间占用 |
| list |  ArrayList    | 把数量字段删掉了简化处理 |

现在让我们先把基本数据创建到 ClassFile、ConstantPoolInfo、FieldInfo、MethodInfo、AttributeInfo  java类中

在创建数据结构的时候会发现遇到了 `常量池` 的问题，这东西也在 method 前面，我们不得不先解析出来，但是常量池涉及到多种不同的常量格式（长度不一样、类型不一样、用途不一样），所以还需要构建一套对应不同类型的格式结构

另外对于 access_flags 等有限集合类型的，为了方便后续代码使用，也都抽出了对应的常量，具体见 domain 文件

进入疯狂敲代码阶段……

