package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantDouble extends AbstractConstant {
    private double data;

    @Override
    public void parseData(DataInput input) throws IOException {
        data = input.readDouble();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.DOUBLE;
    }
}