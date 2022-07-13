package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * LocalVariableTypeTable_attribute {
 * u2 attribute_name_index;
 * u4 attribute_length;
 * u2 local_variable_type_table_length;
 * {   u2 start_pc;
 * u2 length;
 * u2 name_index;
 * u2 signature_index;
 * u2 index;
 * } local_variable_type_table[local_variable_type_table_length];
 * }
 */
@Getter
public class AttributeLocalVariableTypeItem extends AttributeItem {
    int startPc;
    int length;
    int nameIndex;
    int signatureIndex;
    int index;

    public static AttributeLocalVariableTypeItem parseData(DataInput input,
                                                           ClassFile classFile) throws IOException {
        AttributeLocalVariableTypeItem table = new AttributeLocalVariableTypeItem();
        table.classFile = classFile;
        table.startPc = input.readUnsignedShort();
        table.length = input.readUnsignedShort();
        table.nameIndex = input.readUnsignedShort();
        table.signatureIndex = input.readUnsignedShort();
        table.index = input.readUnsignedShort();
        return table;
    }
}