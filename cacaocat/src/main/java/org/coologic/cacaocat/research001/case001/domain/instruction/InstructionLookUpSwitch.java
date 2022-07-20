package org.coologic.cacaocat.research001.case001.domain.instruction;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * lookupswitch  case 不连续时使用此指令
 * <0-3 byte pad>  这里进行了字节对齐填充，保证 defaultbyte1 一定是在4的倍数字节开始
 * defaultbyte1 4byte 默认指令偏移量
 * defaultbyte2
 * defaultbyte3
 * defaultbyte4
 * npairs1   多少个 key value 对
 * npairs2
 * npairs3
 * npairs4
 * match-offset pairs...   每一对的key value 都是 4byte大小
 */
public class InstructionLookUpSwitch extends AbstractInstructionDynamicLengthOperand {
    int defaultOffset;

    Map<Integer, Integer> casePairs = new LinkedHashMap<>();

    public InstructionLookUpSwitch(ClassFile classFile) {
        super(classFile);
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
        int npairs = input.readInt();

        int npairsI = 0;
        while (npairsI++ < npairs) {
            casePairs.put(input.readInt(), input.readInt());
        }
    }

    @Override
    public int size() {
        return super.size() + padSize + 4 * 2 + 8 * casePairs.size();
    }


}