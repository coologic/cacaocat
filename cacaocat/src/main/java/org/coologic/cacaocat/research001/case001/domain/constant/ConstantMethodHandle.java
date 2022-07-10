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

    public ConstantMethodHandle(ClassFile classFileparseData(DataInput input) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        referenceKind = ConstantMethodHandleTypeEnum.getByTag(input.readUnsignedByte());
        referenceIndex = input.readUnsignedShort();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.METHOD_HANDLE;
    }
}