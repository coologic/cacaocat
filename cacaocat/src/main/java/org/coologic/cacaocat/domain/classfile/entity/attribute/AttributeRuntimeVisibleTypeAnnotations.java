package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.entity.attribute.inner.AttributeTypeAnnotationItem;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RuntimeVisibleTypeAnnotations_attribute {
 *     u2              attribute_name_index;
 *     u4              attribute_length;
 *     u2              num_annotations;
 *     type_annotation annotations[num_annotations];
 * }
 */
@Getter
public class AttributeRuntimeVisibleTypeAnnotations extends AbstractAttribute {
    List<AttributeTypeAnnotationItem> annotations = new ArrayList<>();

    public AttributeRuntimeVisibleTypeAnnotations(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int componetCount = input.readUnsignedShort();
        while (annotations.size() < componetCount) {
            annotations.add(AttributeTypeAnnotationItem.parseData(input, classFile));
        }
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.RUNTIME_VISIBLE_TYPE_ANNOTATIONS;
    }
}