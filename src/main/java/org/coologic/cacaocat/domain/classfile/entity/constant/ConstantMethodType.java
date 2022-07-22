package org.coologic.cacaocat.domain.classfile.entity.constant;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.ConstantTypeEnum;

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
    public String toString() {
        return classFile.getConstants().get(descriptorIndex).toString();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.METHODTYPE;
    }
}