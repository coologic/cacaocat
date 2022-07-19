package org.coologic.cacaocat.research001.case001.domain.instruction;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

public class InstructionByteOperand extends AbstractInstruction {

    int     operand;
    boolean wide = false;

    public InstructionByteOperand(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input, boolean isWide) throws IOException {
        this.wide = isWide;
        operand = isWide ? input.readUnsignedShort() : input.readUnsignedByte();
    }

    @Override
    public int size() {
        int operandSize = wide ? 2 : 1;
        return super.size() + operandSize;
    }
}