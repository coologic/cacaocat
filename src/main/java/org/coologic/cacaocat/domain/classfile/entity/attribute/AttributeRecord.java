package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.entity.attribute.inner.AttributeRecordComponentItem;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Record_attribute {
 *     u2                    attribute_name_index;
 *     u4                    attribute_length;
 *     u2                    components_count;
 *     record_component_info components[components_count];
 * }
 */
@Getter
public class AttributeRecord extends AbstractAttribute {
    List<AttributeRecordComponentItem> components = new ArrayList<>();

    public AttributeRecord(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int componetCount = input.readUnsignedShort();
        while (components.size() < componetCount) {
            components.add(AttributeRecordComponentItem.parseData(input, classFile));
        }
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.RECORD;
    }
}