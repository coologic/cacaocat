package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

/**
 * NestHost_attribute {
 * u2 attribute_name_index;
 * u4 attribute_length;
 * u2 host_class_index;
 * }
 */
@Getter
public class AttributeNestHost extends AbstractAttribute {
    int hostClassIndex;

    public AttributeNestHost(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        hostClassIndex = input.readUnsignedByte();

    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.NEST_HOST;
    }
}