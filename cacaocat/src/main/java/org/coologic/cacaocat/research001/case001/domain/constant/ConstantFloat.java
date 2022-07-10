package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantFloat extends AbstractConstant {
    private float data;

    @Override
    public void parseData(DataInput input) throws IOException {
        data = input.readFloat();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.FLOAT;
    }
}