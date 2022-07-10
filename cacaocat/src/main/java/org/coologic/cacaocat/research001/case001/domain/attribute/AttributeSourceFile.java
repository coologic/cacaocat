package org.coologic.cacaocat.research001.case001.domain.attribute;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

public class AttributeSourceFile extends AbstractAttribute {
    private int sourceFileIndex;


    public AttributeSourceFile(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        sourceFileIndex = input.readUnsignedShort();
    }

    @Override
    public String getDesc() {
        return classFile.getConstants().get(sourceFileIndex).getDesc();
    }
}