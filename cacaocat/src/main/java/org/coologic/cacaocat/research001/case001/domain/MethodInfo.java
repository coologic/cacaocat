package org.coologic.cacaocat.research001.case001.domain;

import java.util.List;

public class MethodInfo {
    /**
     * 访问标志
     */
    int             access_flags;

    /**
     * 方法名索引
     */
    int             name_index;

    /**
     * 描述索引
     */
    int             descriptor_index;

    /**
     * 属性
     */
    List<AttributeInfo> attributes;
    ///**
    // *
    // */
    //int             attributes_count;
    //
    ///**
    // *
    // */
    //attribute_info attributes[attributes_count];
}