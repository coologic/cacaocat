package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Data;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.List;

@Data
public abstract class AbstractAttribute implements Attribute{

    protected ClassFile classFile;

    /**
     * 属性名索引
     */
    protected int attributeNameIndex;

    protected int attributeLength;
    protected List<Byte> attributeSourceData;

    public AbstractAttribute(ClassFile classFile) {
        this.classFile = classFile;
    }

    @Override
    public void parse(DataInput input) throws IOException {
        parseData(input);
    }

    abstract public void parseData(DataInput input) throws IOException;

    @Override
    public AttributeTypeEnum type() {
        return null;
    }

    @Override
    public String getDesc() {
        return classFile.getConstants().get(attributeNameIndex).getDesc();
    }
}