package org.coologic.cacaocat.domain.classfile.entity.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

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
public class AttributeParameterAnnotationItem extends AttributeItem {
    private List<AttributeAnnotationItem> annotations = new ArrayList<>();

    public static AttributeParameterAnnotationItem parseData(DataInput input, ClassFile classFile) throws IOException {
        AttributeParameterAnnotationItem table = new AttributeParameterAnnotationItem();
        table.classFile = classFile;
        int count = input.readUnsignedShort();
        while (table.annotations.size() < count) {
            table.annotations.add(AttributeAnnotationItem.parseData(input, classFile));
        }
        return table;
    }
}