package org.coologic.cacaocat.domain.classfile.entity.instruction;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

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
    public void parseData(DataInput input, boolean isWide, int index) throws IOException {
        super.parseData(input, isWide, index);
        count = input.readUnsignedByte();
        input.readUnsignedByte();
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