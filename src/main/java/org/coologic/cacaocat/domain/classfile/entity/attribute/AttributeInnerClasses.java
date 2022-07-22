package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.entity.attribute.inner.AttributeInnerClassesItem;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InnerClasses_attribute {
 * u2 attribute_name_index;
 * u4 attribute_length;
 * u2 number_of_classes;
 * {   u2 inner_class_info_index;
 * u2 outer_class_info_index;
 * u2 inner_name_index;
 * u2 inner_class_access_flags;
 * } classes[number_of_classes];
 * }
 */
@Getter
public class AttributeInnerClasses extends AbstractAttribute {
    List<AttributeInnerClassesItem> items = new ArrayList<>();

    public AttributeInnerClasses(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int length = input.readUnsignedShort();
        while (items.size() < length) {
            items.add(AttributeInnerClassesItem.parseData(input, classFile));
        }
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.INNER_CLASSES;
    }
}