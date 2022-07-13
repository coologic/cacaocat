package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeLocalVariableTypeItem;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.List;

/**
 * LocalVariableTypeTable_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 *     u2 local_variable_type_table_length;
 *     {   u2 start_pc;
 *         u2 length;
 *         u2 name_index;
 *         u2 signature_index;
 *         u2 index;
 *     } local_variable_type_table[local_variable_type_table_length];
 * }
 */
@Getter
public class AttributeLocalVariableTypeTable extends AbstractAttribute {
    List<AttributeLocalVariableTypeItem> tables;

    public AttributeLocalVariableTypeTable(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int count = input.readUnsignedShort();
        while (tables.size() < count) {
            tables.add(AttributeLocalVariableTypeItem.parseData(input));
        }
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.LOCAL_VARIABLE_TYPE_TABLE;
    }
}