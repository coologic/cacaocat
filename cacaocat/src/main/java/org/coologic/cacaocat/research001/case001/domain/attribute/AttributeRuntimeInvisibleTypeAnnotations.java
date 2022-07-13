package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeTypeAnnotationItem;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RuntimeInvisibleTypeAnnotations_attribute {
 *     u2              attribute_name_index;
 *     u4              attribute_length;
 *     u2              num_annotations;
 *     type_annotation annotations[num_annotations];
 * }
 */
@Getter
public class AttributeRuntimeInvisibleTypeAnnotations extends AbstractAttribute {
    List<AttributeTypeAnnotationItem> annotations = new ArrayList<>();

    public AttributeRuntimeInvisibleTypeAnnotations(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int componetCount = input.readUnsignedShort();
        while (annotations.size() < componetCount) {
            annotations.add(AttributeTypeAnnotationItem.parseData(input));
        }
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.RUNTIME_INVISIBLE_TYPE_ANNOTATIONS;
    }
}