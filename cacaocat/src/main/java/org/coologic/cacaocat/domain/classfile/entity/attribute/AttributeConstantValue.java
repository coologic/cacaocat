package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

/**
 * ConstantValue_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 *     u2 constantvalue_index;
 * }
 */
@Getter
public class AttributeConstantValue extends AbstractAttribute {
    int constantValueIndex;

    public AttributeConstantValue(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        constantValueIndex = input.readUnsignedShort();
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.CONSTANT_VALUE;
    }
}