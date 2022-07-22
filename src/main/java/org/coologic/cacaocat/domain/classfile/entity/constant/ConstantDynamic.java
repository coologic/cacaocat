package org.coologic.cacaocat.domain.classfile.entity.constant;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantDynamic extends AbstractConstant {
    //这个是指向 ClassFile.attributes 的索引
    private int bootstrapMethodAttributeIndex;
    private int nameAndTypeIndex;

    public ConstantDynamic(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        //索引是>=0的一定要用无符号读取
        bootstrapMethodAttributeIndex = input.readUnsignedShort();
        nameAndTypeIndex = input.readUnsignedShort();
    }

    @Override
    public String toString() {
        return classFile.getConstants().get(nameAndTypeIndex).toString();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.DYNAMIC;
    }
}