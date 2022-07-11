package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;

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
public class AttributeCodeExceptionTable {
    private int startPc;
    private int endPc;
    private int handlerPc;
    private int catchType;

    public static AttributeCodeExceptionTable parseData(DataInput input) throws IOException {
        AttributeCodeExceptionTable exceptionTable = new AttributeCodeExceptionTable();
        exceptionTable.startPc = input.readUnsignedShort();
        exceptionTable.endPc = input.readUnsignedShort();
        exceptionTable.handlerPc = input.readUnsignedShort();
        exceptionTable.catchType = input.readUnsignedShort();
        return exceptionTable;
    }
}