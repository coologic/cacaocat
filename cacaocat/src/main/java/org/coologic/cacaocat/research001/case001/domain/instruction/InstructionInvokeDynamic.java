package org.coologic.cacaocat.research001.case001.domain.instruction;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

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

    int blankZero;

    public InstructionInvokeDynamic(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input, boolean isWide) throws IOException {
        super.parseData(input, isWide);
        input.readUnsignedShort();
    }
}