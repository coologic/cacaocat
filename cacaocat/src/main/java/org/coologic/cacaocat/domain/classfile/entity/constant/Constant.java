package org.coologic.cacaocat.domain.classfile.entity.constant;

import org.coologic.cacaocat.domain.classfile.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

public interface Constant {
    /**
     * 解析
     *
     * @param input 读取流
     * @throws IOException io异常
     */
    void parse(DataInput input) throws IOException;

    /**
     * 常量类型
     *
     * @return 类型
     */
    ConstantTypeEnum type();
}