package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

/**
 * Synthetic_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 * }
 */
@Getter
public class AttributeDeprecated extends AbstractAttribute {

    public AttributeDeprecated(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.DEPRECATED;
    }
}