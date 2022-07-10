package org.coologic.cacaocat.research001.case001.domain;

import lombok.Data;

import java.util.List;

@Data
public class AttributeInfo {

    ClassFile classFile;

    /**
     * 属性名索引
     */
    int attributeNameIndex;

    int attributeLength;
    List<Byte> attributeSourceData;

    public AttributeInfo(ClassFile classFile) {
        this.classFile = classFile;
    }
}