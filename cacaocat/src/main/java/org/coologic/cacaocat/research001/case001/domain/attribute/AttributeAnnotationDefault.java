package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeElementValueItem;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeTypeAnnotationItem;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        defaultValue = AttributeElementValueItem.parseData(input);
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.ANNOTATION_DEFAULT;
    }
}