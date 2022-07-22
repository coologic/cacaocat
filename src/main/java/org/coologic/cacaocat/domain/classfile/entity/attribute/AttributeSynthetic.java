package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

/**
 * Synthetic_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 * }
 */
@Getter
public class AttributeSynthetic extends AbstractAttribute {

    public AttributeSynthetic(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.SYNTHETIC;
    }
}