package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantDouble extends AbstractConstant {
    private double data;

    public ConstantDouble(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        data = input.readDouble();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.DOUBLE;
    }
}