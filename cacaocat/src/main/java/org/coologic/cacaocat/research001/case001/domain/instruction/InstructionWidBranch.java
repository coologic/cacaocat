package org.coologic.cacaocat.research001.case001.domain.instruction;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

public class InstructionWidBranch extends AbstractInstruction {

    int operand;

    public InstructionWidBranch(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input, boolean isWide) throws IOException {
        operand = input.readInt();
    }

    @Override
    public int size() {
        return super.size() + 4;
    }
}