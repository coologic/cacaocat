package org.coologic.cacaocat.domain.classfile.entity.attribute;

import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

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