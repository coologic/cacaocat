package org.coologic.cacaocat.domain.classfile.entity.instruction;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

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