package org.coologic.cacaocat.research001.case001.domain.instruction;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.IOException;

public class InstructionByteOperand extends AbstractInstruction {

    int operand;

    public InstructionByteOperand(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input, boolean isWide) throws IOException {
        operand = isWide ? input.readUnsignedShort() : input.readUnsignedByte();
    }
}