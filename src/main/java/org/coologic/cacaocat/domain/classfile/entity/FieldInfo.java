package org.coologic.cacaocat.domain.classfile.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.coologic.cacaocat.domain.classfile.entity.attribute.Attribute;
import org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FieldInfo {
    @JsonIgnore
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

    public String getName() {
        return classFile.getConstants().get(nameIndex).toString();
    }

    public String getDescriptor() {
        return classFile.getConstants().get(descriptorIndex).toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        accessFlags.forEach(o -> stringBuilder.append(o.getCode()).append(" "));
        stringBuilder.append(getDescriptor())
                .append(" ")
                .append(getName());
        return stringBuilder.toString();
    }
}