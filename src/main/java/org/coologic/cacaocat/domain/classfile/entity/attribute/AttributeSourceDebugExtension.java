package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

/**
 * SourceDebugExtension_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 *     u1 debug_extension[attribute_length];
 * }
 */
@Getter
public class AttributeSourceDebugExtension extends AbstractAttribute {
    byte[] debugExtension;

    public AttributeSourceDebugExtension(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        debugExtension = new byte[attributeLength];
        input.readFully(debugExtension);
    }


    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.SOURCE_DEBUG_EXTENSION;
    }
}