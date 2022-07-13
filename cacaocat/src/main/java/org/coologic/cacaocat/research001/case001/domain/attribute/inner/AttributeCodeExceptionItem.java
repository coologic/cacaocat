package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * Code_attribute {
 * u2 attribute_name_index;
 * u4 attribute_length;
 * u2 max_stack;
 * u2 max_locals;
 * u4 code_length;
 * u1 code[code_length];
 * u2 exception_table_length;
 * {   u2 start_pc;
 * u2 end_pc;
 * u2 handler_pc;
 * u2 catch_type;
 * } exception_table[exception_table_length];   --- 特殊处理这部分
 * u2 attributes_count;
 * attribute_info attributes[attributes_count];
 * }
 */
@Getter
public class AttributeCodeExceptionItem extends AttributeItem {
    private int startPc;
    private int endPc;
    private int handlerPc;
    private int catchType;

    public static AttributeCodeExceptionItem parseData(DataInput input,
                                                       ClassFile classFile) throws IOException {
        AttributeCodeExceptionItem table = new AttributeCodeExceptionItem();
        table.classFile = classFile;
        table.startPc = input.readUnsignedShort();
        table.endPc = input.readUnsignedShort();
        table.handlerPc = input.readUnsignedShort();
        table.catchType = input.readUnsignedShort();
        return table;
    }
}