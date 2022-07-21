package org.coologic.cacaocat.domain.classfile.entity.constant;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantNameAndType extends AbstractConstant {
    private int nameIndex;
    //这个指向的也是 utf8
    private int descriptorIndex;

    public ConstantNameAndType(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        //索引是>=0的一定要用无符号读取
        nameIndex = input.readUnsignedShort();
        descriptorIndex = input.readUnsignedShort();
    }

    @Override
    public String toString() {
        return String.format("%s - %s", classFile.getConstants().get(nameIndex).toString(),
                classFile.getConstants().get(descriptorIndex).toString());
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.NAME_AND_TYPE;
    }
}