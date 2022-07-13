package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

/**
 * Deprecated_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 * }
 */
@Getter
public class AttributeSignature extends AbstractAttribute {
    int signatureIndex;

    public AttributeSignature(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        signatureIndex = input.readUnsignedShort();
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.SIGNATURE;
    }
}