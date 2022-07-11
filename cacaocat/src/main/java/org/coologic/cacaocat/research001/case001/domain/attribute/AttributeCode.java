package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.ClassFileParser;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeCodeExceptionTable;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * } exception_table[exception_table_length];
 * u2 attributes_count;
 * attribute_info attributes[attributes_count];
 * }
 */
@Getter
public class AttributeCode extends AbstractAttribute {
    private int        maxStack;
    private int        maxLocals;
    private int        codeLength;
    //todo 具体值暂时没处理
    private byte[]                            code;
    private List<AttributeCodeExceptionTable> exceptionTables = new ArrayList<>();
    private List<Attribute>                   attributes      = new ArrayList<>();

    public AttributeCode(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        maxStack = input.readUnsignedShort();
        maxLocals = input.readUnsignedShort();
        codeLength = input.readInt();
        code = new byte[codeLength];
        input.readFully(code);
        int exceptionTableLength = input.readUnsignedShort();
        while (exceptionTables.size() < exceptionTableLength) {
            this.exceptionTables.add(AttributeCodeExceptionTable.parseData(input));
        }

        attributes =  ClassFileParser.parseAttribute(input, classFile);
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.CODE;
    }
}