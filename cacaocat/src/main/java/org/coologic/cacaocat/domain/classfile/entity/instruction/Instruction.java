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
     * 获取指令相对于当前code区域的偏移量
     * @return 位置
     */
    int offset();

    /**
     * 获取操作数的描述信息
     * 如果为偏移量：返回偏移量数字
     * 如果为常量池索引：返回常量池内容
     * @return 操作数描述信息
     */
    String operandDesc();

    /**
     * 当前指令长度 包括指令码的长度
     * @return 长度
     */
    int size();
}