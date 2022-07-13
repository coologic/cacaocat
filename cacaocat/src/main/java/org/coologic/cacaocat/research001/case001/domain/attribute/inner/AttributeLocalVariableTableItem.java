package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * LocalVariableTable_attribute {
 * *     u2 attribute_name_index;
 * *     u4 attribute_length;
 * *     u2 local_variable_table_length;
 * *     {   u2 start_pc;
 * *         u2 length;
 * *         u2 name_index;
 * *         u2 descriptor_index;
 * *         u2 index;
 * *     } local_variable_table[local_variable_table_length];
 * * }
 */
@Getter
public class AttributeLocalVariableTableItem extends AttributeItem {
    //起始PC
    private int startPc;
    //长度
    private int length;
    //名字
    private int nameIndex;
    //描述符
    private int descriptorIndex;
    //序号
    private int index;

    public String getName() {
        return getClassFile().getConstants().get(nameIndex).toString();
    }

    public String getDescriptor() {
        return getClassFile().getConstants().get(descriptorIndex).toString();
    }

    @Override
    public String toString() {
        return getDescriptor() + " " + getName();
    }

    public static AttributeLocalVariableTableItem parseData(DataInput input,
                                                            ClassFile classFile) throws IOException {
        AttributeLocalVariableTableItem table = new AttributeLocalVariableTableItem();
        table.classFile = classFile;
        table.startPc = input.readUnsignedShort();
        table.length = input.readUnsignedShort();
        table.nameIndex = input.readUnsignedShort();
        table.descriptorIndex = input.readUnsignedShort();
        table.index = input.readUnsignedShort();
        return table;
    }
}