package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeLocalVariableTableItem;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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