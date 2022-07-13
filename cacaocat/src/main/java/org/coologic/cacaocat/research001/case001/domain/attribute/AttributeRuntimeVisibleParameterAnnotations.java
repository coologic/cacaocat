package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeRecordComponentItem;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RuntimeVisibleParameterAnnotations_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 *     u1 num_parameters;
 *     {   u2         num_annotations;
 *         annotation annotations[num_annotations];
 *     } parameter_annotations[num_parameters];
 * }
 */
@Getter
public class AttributeRuntimeVisibleParameterAnnotations extends AbstractAttribute {
    List<AttributeRecordComponentItem> components = new ArrayList<>();

    public AttributeRuntimeVisibleParameterAnnotations(ClassFile classFile) {
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