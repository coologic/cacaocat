package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.ClassFileParser;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.Attribute;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnumSet;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * record_component_info {
 *     u2             name_index;
 *     u2             descriptor_index;
 *     u2             attributes_count;
 *     attribute_info attributes[attributes_count];
 * }
 */
@Getter
public class AttributeRecordComponentItem extends AttributeItem {
    private int                  nameIndex;
    private int             descriptorIndex;
    private List<Attribute> attributes;

    public static AttributeRecordComponentItem parseData(DataInput input, ClassFile classFile) throws IOException {
        AttributeRecordComponentItem table = new AttributeRecordComponentItem();
        table.classFile = classFile;
        table.nameIndex = input.readUnsignedShort();
        table.descriptorIndex = input.readUnsignedShort();
        table.attributes = ClassFileParser.parseAttribute(input, classFile);
        return table;
    }
}