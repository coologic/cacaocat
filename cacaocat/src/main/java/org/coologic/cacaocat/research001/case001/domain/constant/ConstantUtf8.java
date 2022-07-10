package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Data
public class ConstantUtf8 implements Constant {
    /**
     * 常量字符串的具体内容
     */
    private String data;

    @Override
    public void parse(DataInput input) throws IOException {
        /**
         * u1 tag;
         * u2 length;
         * u1 bytes[length];
         * tag外部已经读过了不需要重复读，length & bytes 虽然在结构体中是两个字段，但实际上这是复合UTF标准规则的
         * 使用io工具UTF读取时会自动读到长度，具体看 java.io.DataInput.readUTF 注释
         */
        data = input.readUTF();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.UTF8;
    }
}