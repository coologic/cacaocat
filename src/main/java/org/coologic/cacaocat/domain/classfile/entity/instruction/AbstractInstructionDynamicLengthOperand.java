package org.coologic.cacaocat.domain.classfile.entity.instruction;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

/**
 * 针对 switch 类型抽象出来的动态长度指令累
 */
public abstract class AbstractInstructionDynamicLengthOperand extends AbstractInstruction {

    protected int padSize;

    protected AbstractInstructionDynamicLengthOperand(ClassFile classFile) {
        super(classFile);
    }


    protected final int calPadSize(int index) {
        // index 为 当前指令开头的位置（未读取当前指令码时的值，所以要+1）
        int padMidSize = 4 - (index + 1) % 4;
        return padMidSize == 4 ? 0 : padMidSize;
    }
}