package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantMethodType extends AbstractConstant {
    private int descriptorIndex;

    public ConstantMethodType(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        descriptorIndex = input.readUnsignedShort();
    }

    @Override
    public String getDesc() {
        return classFile.getConstants().get(descriptorIndex).getDesc();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.METHODTYPE;
    }
}