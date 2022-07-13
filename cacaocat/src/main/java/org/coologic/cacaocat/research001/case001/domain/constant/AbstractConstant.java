package org.coologic.cacaocat.research001.case001.domain.constant;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

public abstract class AbstractConstant implements Constant {
    protected final ClassFile classFile;

    public AbstractConstant(ClassFile classFile) {
        this.classFile = classFile;
    }

    @Override
    public final void parse(DataInput input) throws IOException {
        parseData(input);
    }

    @Override
    public String toString() {
        return getDesc();
    }

    abstract public void parseData(DataInput input) throws IOException;
}