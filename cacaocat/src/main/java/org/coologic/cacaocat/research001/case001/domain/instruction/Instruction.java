package org.coologic.cacaocat.research001.case001.domain.instruction;

import org.coologic.cacaocat.research001.case001.domain.type.OpcodeTypeEnum;
import org.coologic.cacaocat.research001.case001.utils.ObservableByteArrayInputStream;

import java.io.DataInput;
import java.io.IOException;

public interface Instruction {
    /**
     * 解析
     *
     * @param input 读取流
     * @throws IOException io异常
     */
    void parse(DataInput input, OpcodeTypeEnum type, boolean wide) throws IOException;

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