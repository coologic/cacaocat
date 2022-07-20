package org.coologic.cacaocat.research001.case001.domain.instruction;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * multianewarray
 * indexbyte1
 * indexbyte2
 * dimensions
 */
public class InstructionMultiNewArray extends InstructionShortOperand {

    int dimensions;

    public InstructionMultiNewArray(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input, boolean isWide, int index) throws IOException {
        super.parseData(input, isWide, index);
        dimensions = input.readUnsignedByte();
    }

    @Override
    public int size() {
        return super.size() + 1;
    }
}