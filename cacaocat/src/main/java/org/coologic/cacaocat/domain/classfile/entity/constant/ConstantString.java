package org.coologic.cacaocat.domain.classfile.entity.constant;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantString extends AbstractConstant {
    private int stringIndex;

    public ConstantString(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        //索引是>=0的一定要用无符号读取
        stringIndex = input.readUnsignedShort();
    }

    @Override
    public String toString() {
        return classFile.getConstants().get(stringIndex).toString();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.STRING;
    }
}