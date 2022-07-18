package org.coologic.cacaocat.research001.case001.domain.instruction;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * invokeinterface
 * indexbyte1
 * indexbyte2
 * count
 * 0
 */
public class InstructionInvokeInterface extends InstructionShortOperand {

    int count;

    public InstructionInvokeInterface(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input, boolean isWide) throws IOException {
        super.parseData(input, isWide);
        count = input.readUnsignedByte();
        input.readUnsignedByte();
    }
}