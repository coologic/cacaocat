package org.coologic.cacaocat.research001.case001.domain.constant;

import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

public interface Constant {
    /**
     * 解析
     * @param input 读取流
     * @throws IOException io异常
     */
    void parse(DataInput input) throws IOException;

    /**
     * 常量类型
     * @return 类型
     */
    ConstantTypeEnum type();

    /**
     * 获取描述信息
     * @return 描述信息
     */
    default String getDesc() {
        return type().getByteCodeCode();
    }
}