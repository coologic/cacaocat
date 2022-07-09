package org.coologic.cacaocat.research001.case001.domain;

import java.util.List;

public class FieldInfo {
    /**
     * 访问标志
     */
    int accessFlags;

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
}