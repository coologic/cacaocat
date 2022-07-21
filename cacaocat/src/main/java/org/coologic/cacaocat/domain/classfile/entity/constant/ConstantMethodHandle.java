package org.coologic.cacaocat.domain.classfile.entity.constant;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.ConstantMethodHandleTypeEnum;
import org.coologic.cacaocat.domain.classfile.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantMethodHandle extends AbstractConstant {
    private ConstantMethodHandleTypeEnum referenceKind;
    private int                          referenceIndex;

    public ConstantMethodHandle(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        referenceKind = ConstantMethodHandleTypeEnum.getByTag(input.readUnsignedByte());
        referenceIndex = input.readUnsignedShort();
    }

    @Override
    public String toString() {
        return String.format("%s - %s", referenceKind.getByteCodeCode(), classFile.getConstants().get(referenceIndex).toString());
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.METHOD_HANDLE;
    }
}