package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeLocalVariableTableItem;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LocalVariableTable_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 *     u2 local_variable_table_length;
 *     {   u2 start_pc;
 *         u2 length;
 *         u2 name_index;
 *         u2 descriptor_index;
 *         u2 index;
 *     } local_variable_table[local_variable_table_length];
 * }
 */
@Getter
public class AttributeLocalVariableTable extends AbstractAttribute {
    List<AttributeLocalVariableTableItem> items = new ArrayList<>();

    public AttributeLocalVariableTable(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int length = input.readUnsignedShort();
        while (items.size() < length) {
            items.add(AttributeLocalVariableTableItem.parseData(input, classFile));
        }
    }


    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.LOCAL_VARIABLE_TABLE;
    }
}