package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantInteger extends AbstractConstant {
    private int data;

    public ConstantInteger(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        data = input.readInt();
    }

    @Override
    public String getDesc() {
        return String.valueOf(data);
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.INTEGER;
    }
}