package org.coologic.cacaocat.domain.classfile.entity.constant;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantModule extends AbstractConstant {
    private int nameIndex;

    public ConstantModule(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        //索引是>=0的一定要用无符号读取
        nameIndex = input.readUnsignedShort();
    }

    @Override
    public String toString() {
        return classFile.getConstants().get(nameIndex).toString();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.MODULE;
    }
}