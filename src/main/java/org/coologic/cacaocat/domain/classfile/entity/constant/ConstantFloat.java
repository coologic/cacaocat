package org.coologic.cacaocat.domain.classfile.entity.constant;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantFloat extends AbstractConstant {
    private float data;

    public ConstantFloat(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        data = input.readFloat();
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.FLOAT;
    }
}