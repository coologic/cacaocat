package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Data
public class ConstantDouble implements Constant {
    private double data;

    @Override
    public void parse(DataInput input) throws IOException {
        data = input.readDouble();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.DOUBLE;
    }
}