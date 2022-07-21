package org.coologic.cacaocat.domain.classfile.entity.instruction;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.io.DataInput;
import java.io.IOException;

public class InstructionByteOperand extends AbstractInstruction {

    int     operand;
    boolean wide = false;

    public InstructionByteOperand(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input, boolean isWide, int index) throws IOException {
        this.wide = isWide;
        operand = isWide ? input.readUnsignedShort() : input.readUnsignedByte();
    }

    @Override
    public String operandDesc() {
        return String.valueOf(operand);
    }

    @Override
    public int size() {
        int operandSize = wide ? 2 : 1;
        return super.size() + operandSize;
    }
}