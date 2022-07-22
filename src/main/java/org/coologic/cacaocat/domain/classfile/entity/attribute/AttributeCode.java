package org.coologic.cacaocat.domain.classfile.entity.attribute;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.util.ClassFileParser;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.entity.attribute.inner.AttributeCodeExceptionItem;
import org.coologic.cacaocat.domain.classfile.entity.instruction.Instruction;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
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
    @JsonIgnore
    private byte[]                           code;
    private List<Instruction> instructions;

    private List<AttributeCodeExceptionItem> exceptionTables = new ArrayList<>();
    private List<Attribute>                  attributes      = new ArrayList<>();

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
            this.exceptionTables.add(AttributeCodeExceptionItem.parseData(input, classFile));
        }

        attributes =  ClassFileParser.parseAttribute(input, classFile);

        //解析指令
        instructions = ClassFileParser.parseInstruction(new DataInputStream(new ByteArrayInputStream(code)), classFile, code.length);
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.CODE;
    }
}