package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantLong extends AbstractConstant {
    private long data;

    @Override
    public void parseData(DataInput input) throws IOException {
        data = input.readLong();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.LONG;
    }
}