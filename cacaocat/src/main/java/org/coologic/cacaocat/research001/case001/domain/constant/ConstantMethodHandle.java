package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantMethodHandleTypeEnum;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Data
public class ConstantMethodHandle implements Constant {
    private ConstantMethodHandleTypeEnum referenceKind;
    private int                          referenceIndex;

    @Override
    public void parse(DataInput input) throws IOException {
        referenceKind = ConstantMethodHandleTypeEnum.getByTag(input.readUnsignedByte());
        referenceIndex = input.readUnsignedShort();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.METHOD_HANDLE;
    }
}