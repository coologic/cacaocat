package org.coologic.cacaocat.domain.classfile.entity.instruction;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.io.DataInput;
import java.io.IOException;

public class InstructionZeroOperand extends AbstractInstruction {

    public InstructionZeroOperand(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input, boolean isWide, int index) throws IOException {
        //无操作数不需要解析
    }

    @Override
    public String operandDesc() {
        return "";
    }
}