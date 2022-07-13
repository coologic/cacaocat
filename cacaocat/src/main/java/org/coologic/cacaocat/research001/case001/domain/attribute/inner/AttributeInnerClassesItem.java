package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * InnerClasses_attribute {
 * *     u2 attribute_name_index;
 * *     u4 attribute_length;
 * *     u2 number_of_classes;
 * *     {   u2 inner_class_info_index;
 * *         u2 outer_class_info_index;
 * *         u2 inner_name_index;
 * *         u2 inner_class_access_flags;
 * *     } classes[number_of_classes];
 * * }
 */
@Getter
public class AttributeInnerClassesItem extends AttributeItem {
    private int innerClassInfoIndex;
    private int outerClassInfoIndex;
    private int innerNameIndex;
    private int innerClassAccessFlags;

    public static AttributeInnerClassesItem parseData(DataInput input, ClassFile classFile) throws IOException {
        AttributeInnerClassesItem table = new AttributeInnerClassesItem();
        table.classFile = classFile;
        table.innerClassInfoIndex = input.readUnsignedShort();
        table.outerClassInfoIndex = input.readUnsignedShort();
        table.innerNameIndex = input.readUnsignedShort();
        table.innerClassAccessFlags = input.readUnsignedShort();
        return table;
    }
}