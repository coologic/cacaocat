package org.coologic.cacaocat.research001.case001.domain.type;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.constant.Constant;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantClass;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantDouble;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantDynamic;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantFieldref;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantFloat;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantInteger;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantInterfaceMethodref;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantInvokeDynamic;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantLong;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantMethodHandle;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantMethodType;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantMethodref;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantModule;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantNameAndType;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantPackage;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantString;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantUtf8;

import java.util.function.Function;

@Getter
public enum ConstantTypeEnum {
    /**
     * UTF-8 编码的字符串 字面量，需要先取2字节确定长度再取后续
     * u1 tag;
     * u2 length;
     * u1 bytes[length];
     */
    UTF8("CONSTANT_Utf8", 1, ConstantUtf8::new),
    /**
     * 整数 字面量，直接取得结果
     * u1 tag;
     * u4 bytes;
     */
    INTEGER("CONSTANT_Integer", 3, ConstantInteger::new),
    /**
     * 浮点数 字面量，直接取得结果
     * u1 tag;
     * u4 bytes;
     */
    FLOAT("CONSTANT_Float", 4, ConstantFloat::new),
    /**
     * 长整数 字面量，直接取得结果
     * u1 tag;
     * u4 high_bytes;
     * u4 low_bytes;
     * 特殊空间占用，这个类型会占用两个pool位置，不是一个，构建常量池列表是特别注意
     */
    LONG("constant_long", 5, ConstantLong::new),
    /**
     * 长整数 字面量，直接取得结果
     * u1 tag;
     * u4 high_bytes;
     * u4 low_bytes;
     * 特殊空间占用，这个类型会占用两个pool位置，不是一个，构建常量池列表是特别注意
     */
    DOUBLE("CONSTANT_Double", 6, ConstantDouble::new),
    /**
     * 类或接口  符号引用
     * u1 tag;
     * u2 name_index;  名称
     */
    CLASS("CONSTANT_Class", 7, ConstantClass::new),
    /**
     * 字符串  符号引用
     * u1 tag;
     * u2 string_index;  指向 CONSTANT_Utf8_info 类型的常量索引
     */
    STRING("CONSTANT_String", 8, ConstantString::new),
    /**
     * 字段  符号引用
     * u1 tag;
     * u2 class_index;  类常量索引
     * u2 name_and_type_index;   字段和方法常量索引
     */
    FIELDREF("CONSTANT_Fieldref", 9, ConstantFieldref::new),
    /**
     * 方法  符号引用
     * u1 tag;
     * u2 class_index;  类常量索引
     * u2 name_and_type_index;   字段和方法常量索引
     */
    METHODREF("CONSTANT_Methodref", 10, ConstantMethodref::new),
    /**
     * 字段  符号引用
     * u1 tag;
     * u2 class_index;  类常量索引
     * u2 name_and_type_index;   字段和方法常量索引
     */
    INTERFACE_METHODREF("CONSTANT_InterfaceMethodref", 11, ConstantInterfaceMethodref::new),
    /**
     * 字段和方法  符号引用
     * u1 tag;
     * u2 name_index;
     * u2 descriptor_index;
     */
    NAME_AND_TYPE("CONSTANT_NameAndType", 12, ConstantNameAndType::new),
    /**
     * 方法句柄 符号引用
     * u1 tag;
     * u1 reference_kind;
     * u2 reference_index;
     */
    METHOD_HANDLE("CONSTANT_MethodHandle", 15, ConstantMethodHandle::new),
    /**
     * 方法类型 符号引用
     * u1 tag;
     * u2 descriptor_index;
     */
    METHODTYPE("CONSTANT_MethodType", 16, ConstantMethodType::new),
    /**
     * 调用  符号引用
     * u1 tag;
     * u2 bootstrap_method_attr_index;  属性的索引 要求属性类型是 BootstrapMethods
     * u2 name_and_type_index;  指向代码块
     */
    DYNAMIC("CONSTANT_Dynamic", 17, ConstantDynamic::new),
    /**
     * 动态调用 符号引用
     * u1 tag;
     * u2 bootstrap_method_attr_index; 属性的索引 要求属性类型是 BootstrapMethods
     * u2 name_and_type_index; 指向代码块
     */
    INVOKE_DYNAMIC("CONSTANT_InvokeDynamic", 18, ConstantInvokeDynamic::new),
    /**
     * 模块  符号引用
     * u1 tag;
     * u2 name_index;
     */
    MODULE("CONSTANT_Module", 19, ConstantModule::new),
    /**
     * 包  符号引用
     * u1 tag;
     * u2 name_index;
     */
    PACKAGE("CONSTANT_Package", 20, ConstantPackage::new),
    ;

    /**
     * 常量类型的字节码标准名称
     */
    private final String byteCodeCode;

    /**
     * 常量类型tag
     */
    private final int tag;

    private final Function<ClassFile, Constant> createFunction;

    ConstantTypeEnum(String byteCodeCode, int tag, Function<ClassFile, Constant> createFunction) {
        this.byteCodeCode = byteCodeCode;
        this.tag = tag;
        this.createFunction = createFunction;
    }

    public static ConstantTypeEnum getByTag(int tag) {
        for (var value : ConstantTypeEnum.values()) {
            if (value.getTag() == tag) {
                return value;
            }
        }
        return null;
    }
}