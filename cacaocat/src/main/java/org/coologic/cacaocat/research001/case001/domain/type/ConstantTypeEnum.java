package org.coologic.cacaocat.research001.case001.domain.type;

public enum ConstantTypeEnum {
    /**
     * UTF-8 编码的字符串 字面量，需要先取2字节确定长度再取后续
     *      u1 tag;
     *      u2 length;
     *      u1 bytes[length];
     */
    UTF8("CONSTANT_Utf8", 1, 2),
    /**
     * 整数 字面量，直接取得结果
     *      u1 tag;
     *      u4 bytes;
     */
    INTEGER("CONSTANT_Integer", 3, 4),
    /**
     * 浮点数 字面量，直接取得结果
     *      u1 tag;
     *      u4 bytes;
     */
    FLOAT("CONSTANT_Float", 4, 8),
    /**
     * 长整数 字面量，直接取得结果
     *      u1 tag;
     *      u4 high_bytes;
     *      u4 low_bytes;
     */
    LONG("constant_long", 5, 8),
    /**
     * 长整数 字面量，直接取得结果
     *      u1 tag;
     *      u4 high_bytes;
     *      u4 low_bytes;
     */
    DOUBLE("CONSTANT_Double", 6, 4),
    /**
     * 类或接口  符号引用
     *      u1 tag;
     *      u2 name_index;  名称
     */
    CLASS("CONSTANT_Class", 7, 2),
    /**
     * 字符串  符号引用
     *     u1 tag;
     *     u2 string_index;  指向 CONSTANT_Utf8_info 类型的常量索引
     */
    STRING("CONSTANT_String", 8, 2),
    /**
     * 字段  符号引用
     *     u1 tag;
     *     u2 class_index;  类常量索引
     *     u2 name_and_type_index;   字段和方法常量索引
     */
    FIELDREF("CONSTANT_Fieldref", 9, 4),
    /**
     * 方法  符号引用
     *     u1 tag;
     *     u2 class_index;  类常量索引
     *     u2 name_and_type_index;   字段和方法常量索引
     */
    METHODREF("CONSTANT_Methodref", 10, 4),
    /**
     * 字段  符号引用
     *     u1 tag;
     *     u2 class_index;  类常量索引
     *     u2 name_and_type_index;   字段和方法常量索引
     */
    INTERFACE_METHODREF("CONSTANT_InterfaceMethodref", 11, 4),
    /**
     * 字段和方法  符号引用
     *     u1 tag;
     *     u2 name_index;
     *     u2 descriptor_index;
     */
    NAME_AND_TYPE("CONSTANT_NameAndType", 12, 4),
    /**
     * 方法句柄 符号引用
     *     u1 tag;
     *     u1 reference_kind;
     *     u2 reference_index;
     */
    METHOD_HANDLE("CONSTANT_MethodHandle", 15, 3),
    /**
     * 方法类型 符号引用
     *     u1 tag;
     *     u2 descriptor_index;
     */
    METHODTYPE("CONSTANT_MethodType", 16, 2),
    /**
     * 调用  符号引用
     *     u1 tag;
     *     u2 bootstrap_method_attr_index;  属性的索引 要求属性类型是 BootstrapMethods
     *     u2 name_and_type_index;  指向代码块
     */
    DYNAMIC("CONSTANT_Dynamic", 17, 4),
    /**
     * 动态调用 符号引用
     *     u1 tag;
     *     u2 bootstrap_method_attr_index; 属性的索引 要求属性类型是 BootstrapMethods
     *     u2 name_and_type_index; 指向代码块
     */
    INVOKE_DYNAMIC("CONSTANT_InvokeDynamic", 18, 4),
    /**
     * 模块  符号引用
     *     u1 tag;
     *     u2 name_index;
     */
    MODULE("CONSTANT_Module", 19, 2),
    /**
     * 包  符号引用
     *     u1 tag;
     *     u2 name_index;
     */
    PACKAGE("CONSTANT_Package", 20, 2),
    ;

    /**
     * 常量类型的字节码标准名称
     */
    private final String byteCodeCode;

    /**
     * 常量类型tag
     */
    private final int tag;

    /**
     * 当前类型的空间占用大小 单位字节
     */
    private final int size;

    ConstantTypeEnum(String byteCodeCode, int tag, int size) {
        this.byteCodeCode = byteCodeCode;
        this.tag = tag;
        this.size = size;
    }

    public static ConstantTypeEnum getByTag(int tag) {
        for (var value : ConstantTypeEnum.values()) {
            if (value.getTag() == tag) {
                return value;
            }
        }
        return null;
    }

    /**
     * Getter method for property <tt>byteCodeCode</tt>.
     *
     * @return property value of byteCodeCode
     */
    public String getByteCodeCode() {
        return byteCodeCode;
    }

    /**
     * Getter method for property <tt>tag</tt>.
     *
     * @return property value of tag
     */
    public int getTag() {
        return tag;
    }

    /**
     * Getter method for property <tt>size</tt>.
     *
     * @return property value of size
     */
    public int getSize() {
        return size;
    }
}