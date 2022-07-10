package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantMethodType extends AbstractConstant {
    private int descriptorIndex;

    @Override
    public void parseData(DataInput input) throws IOException {
        descriptorIndex = input.readUnsignedShort();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.METHODTYPE;
    }
}