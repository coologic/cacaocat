package org.coologic.cacaocat.domain.classfile.entity.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

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
public class AttributeLineNumberItem extends AttributeItem {
    //起始PC
    private int startPc;
    //行号
    private int lineNumber;

    public static AttributeLineNumberItem parseData(DataInput input, ClassFile classFile) throws IOException {
        AttributeLineNumberItem table = new AttributeLineNumberItem();
        table.classFile = classFile;
        table.startPc = input.readUnsignedShort();
        table.lineNumber = input.readUnsignedShort();
        return table;
    }
}