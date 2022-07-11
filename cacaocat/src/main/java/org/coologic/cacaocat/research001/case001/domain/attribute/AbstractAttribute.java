package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

@Data
public abstract class AbstractAttribute implements Attribute {

    protected ClassFile classFile;

    /**
     * 属性名索引
     */
    protected int attributeNameIndex;

    protected int attributeLength;

    public AbstractAttribute(ClassFile classFile) {
        this.classFile = classFile;
    }

    @Override
    public void parse(DataInput input) throws IOException {
        attributeLength = input.readInt();
        parseData(input);
    }

    abstract public void parseData(DataInput input) throws IOException;

    @Override
    public String getDesc() {
        return classFile.getConstants().get(attributeNameIndex).getDesc();
    }
}