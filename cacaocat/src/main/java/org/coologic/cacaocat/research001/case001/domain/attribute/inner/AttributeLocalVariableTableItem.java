package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;

import java.io.DataInput;
import java.io.IOException;

/**
 * LocalVariableTable_attribute {
 *  *     u2 attribute_name_index;
 *  *     u4 attribute_length;
 *  *     u2 local_variable_table_length;
 *  *     {   u2 start_pc;
 *  *         u2 length;
 *  *         u2 name_index;
 *  *         u2 descriptor_index;
 *  *         u2 index;
 *  *     } local_variable_table[local_variable_table_length];
 *  * }
 */
@Getter
public class AttributeLocalVariableTableItem {
    private int startPc;
    private int length;
    private int nameIndex;
    private int descriptorIndex;
    private int index;

    public static AttributeLocalVariableTableItem parseData(DataInput input) throws IOException {
        AttributeLocalVariableTableItem table = new AttributeLocalVariableTableItem();
        table.startPc = input.readUnsignedShort();
        table.length = input.readUnsignedShort();
        table.nameIndex = input.readUnsignedShort();
        table.descriptorIndex = input.readUnsignedShort();
        table.index = input.readUnsignedShort();
        return table;
    }
}