package org.coologic.cacaocat.research001.case001.domain;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum;

import java.util.List;

@Data
public class FieldInfo {

    ClassFile classFile;

    /**
     * 访问标志
     */
    int                  accessFlagTag;
    List<AccessFlagEnum> accessFlags;

    /**
     * 字段名索引
     */
    int nameIndex;

    /**
     * 描述索引
     */
    int             descriptorIndex;

    /**
     * 属性
     */
    List<AttributeInfo> attributes;

    ///**
    // * 属性数量
    // */
    //int             attributesCount;
    //
    ///**
    // * 属性
    // */
    //attribute_info attributes[attributes_count];

    public FieldInfo(ClassFile classFile) {
        this.classFile = classFile;
    }
}