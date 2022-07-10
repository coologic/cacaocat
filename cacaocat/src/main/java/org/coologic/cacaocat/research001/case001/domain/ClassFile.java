package org.coologic.cacaocat.research001.case001.domain;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.attribute.AbstractAttribute;
import org.coologic.cacaocat.research001.case001.domain.attribute.Attribute;
import org.coologic.cacaocat.research001.case001.domain.constant.Constant;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum;

import java.util.List;

@Data
public class ClassFile {
    /**
     * 魔数 u4
     */
    int magic;

    /**
     * 副版本号 u2
     */
    int minorVersion;

    /**
     * 主版本号 u2
     */
    int majorVersion;

    /**
     * 常量池
     */
    List<Constant> constants;

    /**
     * 访问标志
     */
    int                  accessFlagTag;
    List<AccessFlagEnum> accessFlags;

    /**
     * 类索引
     */
    int thisClass;

    /**
     * 父类索引
     */
    int superClass;

    /**
     * 接口索引 每个索引都指向常量池
     */
    List<Integer> interfaces;

    /**
     * 字段
     */
    List<FieldInfo> fields;

    /**
     * 方法
     */
    List<MethodInfo> methods;

    /**
     * 属性
     */
    List<Attribute> abstractAttributes;

    /**
     * 特殊逻辑处理不使用 lombok
     */
    public void setMagic(int magic) {
        this.magic = magic;
        if(magic != 0xCAFEBABE) {
            throw new IllegalArgumentException("parse error,class file magic is not 0xCAFEBABE");
        }
    }
}