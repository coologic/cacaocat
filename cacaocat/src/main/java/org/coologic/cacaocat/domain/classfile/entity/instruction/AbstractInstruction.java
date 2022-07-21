package org.coologic.cacaocat.domain.classfile.entity.instruction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.OpcodeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

@Getter
@Setter
public abstract class AbstractInstruction implements Instruction {
    @JsonIgnore
    protected ClassFile classFile;

    protected int index;

    protected OpcodeTypeEnum type;

    protected AbstractInstruction(ClassFile classFile) {
        this.classFile = classFile;
    }

    @Override
    public void parse(DataInput input, OpcodeTypeEnum type, boolean wide, int index) throws IOException {
        this.index = index;
        this.type = type;
        parseData(input, wide, index);
    }

    public abstract void parseData(DataInput input, boolean isWide, int index) throws IOException;

    @Override
    public final OpcodeTypeEnum type() {
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