package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeLocalVariableTypeItem;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.List;

/**
 * StackMapTable_attribute {
 *     u2              attribute_name_index;
 *     u4              attribute_length;
 *     u2              number_of_entries;
 *     stack_map_frame entries[number_of_entries];
 * }
 */
@Getter
public class AttributeStackMapTable extends AbstractAttribute {
    //todo stack_map_frame 没解析

    public AttributeStackMapTable(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.STACK_MAP_TABLE;
    }
}