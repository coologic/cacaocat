package org.coologic.cacaocat.research001.case001.domain.attribute;

import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

public interface Attribute {
    /**
     * 解析
     *
     * @param input 读取流
     * @throws IOException io异常
     */
    void parse(DataInput input) throws IOException;

    /**
     * 属性类型
     *
     * @return 类型
     */
    AttributeTypeEnum type();
}