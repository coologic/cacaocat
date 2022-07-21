package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.entity.attribute.inner.AttributeElementValueItem;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

/**
 * AnnotationDefault_attribute {
 *     u2            attribute_name_index;
 *     u4            attribute_length;
 *     element_value default_value;
 * }
 */
@Getter
public class AttributeAnnotationDefault extends AbstractAttribute {
    AttributeElementValueItem defaultValue;

    public AttributeAnnotationDefault(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        defaultValue = AttributeElementValueItem.parseData(input, classFile);
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.ANNOTATION_DEFAULT;
    }
}