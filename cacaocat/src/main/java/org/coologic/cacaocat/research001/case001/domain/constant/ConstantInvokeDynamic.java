package org.coologic.cacaocat.research001.case001.domain.constant;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
public class ConstantInvokeDynamic extends AbstractConstant {
    //这个是指向 ClassFile.attributes 的索引
    private int bootstrapMethodAttributeIndex;
    private int nameAndTypeIndex;

    public ConstantInvokeDynamic(ClassFile classFileparseData(DataInput input) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        //索引是>=0的一定要用无符号读取
        bootstrapMethodAttributeIndex = input.readUnsignedShort();
        nameAndTypeIndex = input.readUnsignedShort();
    }

    @Override
    public ConstantTypeEnum type() {
        return ConstantTypeEnum.INVOKE_DYNAMIC;
    }
}