package org.coologic.cacaocat.research001.case001.domain;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum;

import java.util.List;

@Data
public class MethodInfo {
    /**
     * 访问标志
     */
    int                  accessFlagTag;
    List<AccessFlagEnum> accessFlags;

    /**
     * 方法名索引
     */
    int             nameIndex;

    /**
     * 描述索引
     */
    int             descriptorIndex;

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