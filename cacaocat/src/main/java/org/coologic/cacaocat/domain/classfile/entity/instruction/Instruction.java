package org.coologic.cacaocat.domain.classfile.entity.instruction;

import org.coologic.cacaocat.domain.classfile.type.OpcodeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

public interface Instruction {
    /**
     * 解析
     *
     * @param input 读取流
     * @param index
     * @throws IOException io异常
     */
    void parse(DataInput input, OpcodeTypeEnum type, boolean wide, int index) throws IOException;

    /**
     * 操作码类型
     *
     * @return 类型
     */
    OpcodeTypeEnum type();

    /**
     * 当前指令长度 包括指令码的长度
     * @return 长度
     */
    int size();
}