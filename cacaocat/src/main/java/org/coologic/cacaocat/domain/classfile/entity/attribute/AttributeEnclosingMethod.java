package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

/**
 * EnclosingMethod_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 *     u2 class_index;
 *     u2 method_index;
 * }
 */
@Getter
public class AttributeEnclosingMethod extends AbstractAttribute {
    int classIndex;
    int methodIndex;

    public AttributeEnclosingMethod(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        classIndex = input.readUnsignedShort();
        methodIndex = input.readUnsignedShort();
    }


    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.ENCLOSING_METHOD;
    }
}