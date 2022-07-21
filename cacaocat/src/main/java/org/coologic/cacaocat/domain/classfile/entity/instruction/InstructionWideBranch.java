package org.coologic.cacaocat.domain.classfile.entity.instruction;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * 宽的特殊
 * goto_w / jsr_w
 * branchbyte1
 * branchbyte2
 * branchbyte3
 * branchbyte4
 */
public class InstructionWideBranch extends AbstractInstruction {

    int operand;

    public InstructionWideBranch(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input, boolean isWide, int index) throws IOException {
        operand = input.readInt();
    }

    @Override
    public int size() {
        return super.size() + 4;
    }
}