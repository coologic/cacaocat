package org.coologic.cacaocat.research001.case001.domain.instruction;

import lombok.Getter;
import lombok.Setter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.OpcodeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
@Setter
public abstract class AbstractInstruction implements Instruction {

    protected ClassFile classFile;

    protected int index;

    protected OpcodeTypeEnum type;

    public AbstractInstruction(ClassFile classFile) {
        this.classFile = classFile;
    }

    @Override
    public void parse(DataInput input, OpcodeTypeEnum type, boolean wide, int index) throws IOException {
        this.index = index;
        this.type = type;
        parseData(input, wide, index);
    }

    abstract public void parseData(DataInput input, boolean isWide, int index) throws IOException;

    @Override
    final public OpcodeTypeEnum type() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("#%d\t\t%s", index, type().getCode());
    }

    @Override
    public int size() {
        return 1;
    }
}