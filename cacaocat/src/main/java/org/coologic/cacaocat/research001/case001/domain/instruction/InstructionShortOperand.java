package org.coologic.cacaocat.research001.case001.domain.instruction;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

public class InstructionShortOperand extends AbstractInstruction {

    int operand;

    public InstructionShortOperand(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input, boolean isWide, int index) throws IOException {
        operand = input.readUnsignedShort();
    }

    @Override
    public int size() {
        return super.size() + 2;
    }
}