package org.coologic.cacaocat.research001.case001.domain.instruction;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * invokeinterface
 * indexbyte1
 * indexbyte2  两个共同构成 cp index 指向常量池
 * count 最小为1 操作数栈的参数数量，参数与 函数声明的数量、类型规则一致
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

    @Override
    public int size() {
        return super.size() + 2;
    }
}