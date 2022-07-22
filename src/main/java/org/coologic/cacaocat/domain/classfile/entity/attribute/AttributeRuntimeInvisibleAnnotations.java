package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.entity.attribute.inner.AttributeAnnotationItem;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RuntimeInvisibleAnnotations_attribute {
 *     u2         attribute_name_index;
 *     u4         attribute_length;
 *     u2         num_annotations;
 *     annotation annotations[num_annotations];
 * }
 */
@Getter
public class AttributeRuntimeInvisibleAnnotations extends AbstractAttribute {
    List<AttributeAnnotationItem> annotations = new ArrayList<>();

    public AttributeRuntimeInvisibleAnnotations(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int componetCount = input.readUnsignedShort();
        while (annotations.size() < componetCount) {
            annotations.add(AttributeAnnotationItem.parseData(input, classFile));
        }
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.RUNTIME_INVISIBLE_ANNOTATIONS;
    }
}