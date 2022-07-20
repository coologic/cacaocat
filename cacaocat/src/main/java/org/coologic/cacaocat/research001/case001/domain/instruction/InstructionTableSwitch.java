package org.coologic.cacaocat.research001.case001.domain.instruction;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * tableswitch
 * <0-3 byte pad>  这里进行了字节对齐填充，保证 defaultbyte1 一定是在4的倍数字节开始
 * defaultbyte1
 * defaultbyte2
 * defaultbyte3
 * defaultbyte4
 * lowbyte1
 * lowbyte2
 * lowbyte3
 * lowbyte4
 * highbyte1
 * highbyte2
 * highbyte3
 * highbyte4
 * jump offsets...
 */
public class InstructionTableSwitch extends AbstractInstruction {

    int operand;
    int padSize;

    public InstructionTableSwitch(ClassFile classFile) {
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