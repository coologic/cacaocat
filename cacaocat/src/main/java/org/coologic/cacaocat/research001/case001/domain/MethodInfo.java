package org.coologic.cacaocat.research001.case001.domain;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.attribute.AbstractAttribute;
import org.coologic.cacaocat.research001.case001.domain.attribute.Attribute;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum;

import java.util.List;

@Data
public class MethodInfo {

    ClassFile classFile;


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
    List<Attribute> abstractAttributes;

    public MethodInfo(ClassFile classFile) {
        this.classFile = classFile;
    }

    public String getDesc() {
        StringBuilder stringBuilder = new StringBuilder();
        accessFlags.forEach(o-> stringBuilder.append(o.getCode()).append(" "));
        stringBuilder.append(classFile.getConstants().get(descriptorIndex).getDesc())
                .append(" ")
                .append(classFile.getConstants().get(nameIndex).getDesc())
                .append(" [");
        abstractAttributes.forEach(o-> stringBuilder.append(o.getDesc()));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}