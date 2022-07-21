package org.coologic.cacaocat.domain.classfile.entity.instruction;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * tableswitch  要求所有case 必须是连续的
 * <0-3 byte pad>  这里进行了字节对齐填充，保证 defaultbyte1 一定是在4的倍数字节开始
 * defaultbyte1   4字节存储 默认值的跳转地址
 * defaultbyte2
 * defaultbyte3
 * defaultbyte4
 * lowbyte1   4字节存储 case最小值
 * lowbyte2
 * lowbyte3
 * lowbyte4
 * highbyte1  4字节存储 case最大值
 * highbyte2
 * highbyte3
 * highbyte4
 * jump offsets...   每个case的跳转链接
 */
public class InstructionTableSwitch extends AbstractInstructionDynamicLengthOperand {
    int defaultOffset;
    int lowByte;
    int highByte;
    List<Integer> caseOffsets = new ArrayList<>();

    public InstructionTableSwitch(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public String operandDesc() {
        return "";
    }

    @Override
    public void parseData(DataInput input, boolean isWide, int index) throws IOException {
        //先计算占位数量
        padSize = calPadSize(index);
        int padSizeI = 0;
        while (padSizeI++ < padSize) {
            input.readUnsignedByte();
        }

        defaultOffset = input.readInt();
        lowByte = input.readInt();
        highByte = input.readInt();

        int caseCount = highByte - lowByte + 1;
        int caseCountI = 0;
        while (caseCountI++ < caseCount) {
            caseOffsets.add(input.readInt());
        }
    }

    @Override
    public int size() {
        return super.size() + padSize + 4 * 3 + 4 * caseOffsets.size();
    }


}