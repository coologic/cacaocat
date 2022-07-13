package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantUtf8 extends AbstractConstant {
    /**
     * 常量字符串的具体内容
     */
    private String data;

    public ConstantUtf8(ClassFile classFile) {
        super(classFile);
    }

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

    public static Constant rootValue(ClassFile classFile) {
        ConstantUtf8 constantUtf8 = new ConstantUtf8(classFile);
        constantUtf8.data = "#0 zero constant";
        return constantUtf8;
    }

    @Override
    public String getDesc() {
        return data;
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.UTF8;
    }
}