package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantMethodHandleTypeEnum;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

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
    public String getDesc() {
        return String.format("%s - %s", referenceKind.getByteCodeCode(), classFile.getConstants().get(referenceIndex).getDesc());
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.METHOD_HANDLE;
    }
}