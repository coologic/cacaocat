package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeLineNumberItem;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LineNumberTable_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 *     u2 line_number_table_length;
 *     {   u2 start_pc;
 *         u2 line_number;
 *     } line_number_table[line_number_table_length];
 * }
 */
@Getter
public class AttributeLineNumberTable extends AbstractAttribute {
    List<AttributeLineNumberItem> items = new ArrayList<>();

    public AttributeLineNumberTable(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int length = input.readUnsignedShort();
        while (items.size() < length) {
            items.add(AttributeLineNumberItem.parseData(input));
        }
    }


    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.LINE_NUMBER_TABLE;
    }
}