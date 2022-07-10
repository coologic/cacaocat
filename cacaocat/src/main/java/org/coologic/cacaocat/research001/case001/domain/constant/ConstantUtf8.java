package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantUtf8 extends AbstractConstant {
    /**
     * 常量字符串的具体内容
     */
    private String data;

    @Override
    public void parseData(DataInput input) throws IOException {
        /**
         * u1 tag;
         * u2 length;
         * u1 bytes[length];
         * tag外部已经读过了不需要重复读，length & bytes 虽然在结构体中是两个字段，但实际上这是复合UTF标准规则的
         * 使用io工具UTF读取时会自动读到长度，具体看 java.io.DataInput.readUTF 注释
         */
        data = input.readUTF();
    }

    public static Constant rootValue() {
        ConstantUtf8 constantUtf8 = new ConstantUtf8();
        constantUtf8.data = "0节点针对有常量引用但并不指向任何常量时使用，此处用这个默认值占位";
        return constantUtf8;
    }


    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.UTF8;
    }
}