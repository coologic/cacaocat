package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;

import java.io.DataInput;
import java.io.IOException;

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
public class AttributeLineNumberItem {
    private int startPc;
    private int lineNumber;

    public static AttributeLineNumberItem parseData(DataInput input) throws IOException {
        AttributeLineNumberItem table = new AttributeLineNumberItem();
        table.startPc = input.readUnsignedShort();
        table.lineNumber = input.readUnsignedShort();
        return table;
    }
}