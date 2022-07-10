package org.coologic.cacaocat.research001.case001.domain;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.attribute.Attribute;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum;

import java.util.ArrayList;
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
    int descriptorIndex;

    /**
     * 属性
     */
    List<Attribute> attributes = new ArrayList<>();

    public FieldInfo(ClassFile classFile) {
        this.classFile = classFile;
    }

    public String getDesc() {
        StringBuilder stringBuilder = new StringBuilder();
        accessFlags.forEach(o -> stringBuilder.append(o.getCode()).append(" "));
        stringBuilder.append(classFile.getConstants().get(descriptorIndex).getDesc())
                .append(" ")
                .append(classFile.getConstants().get(nameIndex).getDesc());
        attributes.forEach(o -> stringBuilder.append("\n    ").append(o.getDesc()));
        return stringBuilder.toString();
    }
}