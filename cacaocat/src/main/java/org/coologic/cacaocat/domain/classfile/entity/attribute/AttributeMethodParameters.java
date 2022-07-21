package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.entity.attribute.inner.AttributeMethodParametersItem;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MethodParameters_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 *     u1 parameters_count;
 *     {   u2 name_index;
 *         u2 access_flags;
 *     } parameters[parameters_count];
 * }
 */
@Getter
public class AttributeMethodParameters extends AbstractAttribute {
    List<AttributeMethodParametersItem> items = new ArrayList<>();

    public AttributeMethodParameters(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int length = input.readUnsignedByte();
        while (items.size() < length) {
            items.add(AttributeMethodParametersItem.parseData(input, classFile));
        }
    }


    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.METHOD_PARAMETERS;
    }
}