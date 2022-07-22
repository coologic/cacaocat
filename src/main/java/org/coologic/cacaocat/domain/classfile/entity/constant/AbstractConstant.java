package org.coologic.cacaocat.domain.classfile.entity.constant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.io.DataInput;
import java.io.IOException;

public abstract class AbstractConstant implements Constant {
    @JsonIgnore
    protected final ClassFile classFile;

    public AbstractConstant(ClassFile classFile) {
        this.classFile = classFile;
    }

    @Override
    public final void parse(DataInput input) throws IOException {
        parseData(input);
    }

    abstract public void parseData(DataInput input) throws IOException;
}