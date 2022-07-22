package org.coologic.cacaocat.domain.classfile.entity.instruction;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * invokedynamic
 * indexbyte1
 * indexbyte2
 * 0
 * 0
 */
public class InstructionInvokeDynamic extends InstructionShortOperand {

    public InstructionInvokeDynamic(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input, boolean isWide, int index) throws IOException {
        super.parseData(input, isWide, index);
        input.readUnsignedShort();
    }

    @Override
    public String operandDesc() {
        return classFile.getConstants().get(operand).toString();
    }

    @Override
    public int size() {
        return super.size() + 2;
    }
}