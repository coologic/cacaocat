package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Data
public class ConstantFieldref implements Constant {
    private int nameIndex;
    private int nameAndTypeIndex;

    @Override
    public void parse(DataInput input) throws IOException {
        //索引是>=0的一定要用无符号读取
        nameIndex = input.readUnsignedShort();
        nameAndTypeIndex = input.readUnsignedShort();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.FIELDREF;
    }
}