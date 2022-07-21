package org.coologic.cacaocat.domain.classfile.entity.attribute;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.io.*;

@Getter
@Setter
public abstract class AbstractAttribute implements Attribute {
    @JsonIgnore
    protected ClassFile classFile;

    /**
     * 属性名索引
     */
    protected int attributeNameIndex;

    protected int attributeLength;

    @JsonIgnore
    protected byte[] sourceAttributeInfo;

    protected AbstractAttribute(ClassFile classFile) {
        this.classFile = classFile;
    }

    @Override
    public void parse(DataInput input) throws IOException {
        attributeLength = input.readInt();

        //上下文隔离，避免某一个实现类写错导致整体读取错误
        sourceAttributeInfo = new byte[attributeLength];
        input.readFully(sourceAttributeInfo);
        try {
            parseData(new DataInputStream(new ByteArrayInputStream(sourceAttributeInfo)));
        } catch (EOFException e) {
            System.err.println(String.format("属性解析失败,type=%s,trace=%s", type().getCode(),e));
        }
    }

    public abstract void parseData(DataInput input) throws IOException;

    @Override
    public String toString() {
        return classFile.getConstants().get(attributeNameIndex).toString();
    }
}