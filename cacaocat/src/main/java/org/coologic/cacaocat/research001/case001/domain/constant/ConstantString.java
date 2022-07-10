package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Data
public class ConstantString implements Constant {
    private int classIndex;

    @Override
    public void parse(DataInput input) throws IOException {
        //索引是>=0的一定要用无符号读取
        classIndex = input.readUnsignedShort();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.STRING;
    }
}