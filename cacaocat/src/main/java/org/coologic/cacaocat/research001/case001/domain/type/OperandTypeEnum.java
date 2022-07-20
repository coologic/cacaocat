package org.coologic.cacaocat.research001.case001.domain.type;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.instruction.*;

import java.util.function.Function;

//操作数类型
@Getter
public enum OperandTypeEnum {
    ZERO_OPERAND("ZERO_OPERAND", "无操作数类型", InstructionZeroOperand::new),
    BYTE_OPERAND("BYTE_OPERAND", "字节操作数类型-若前序操作码为wide则为2字节", InstructionByteOperand::new),
    SHORT_OPERAND("SHORT_OPERAND", "2字节操作数类型", InstructionShortOperand::new),
    BRANCH("BRANCH", "分支指令类型操作", InstructionShortOperand::new),
    WIDE_BRANCH("WIDE_BRANCH", "分支指令类型操作-ide", InstructionWideBranch::new),
    TABLE_SWITCH("TABLE_SWITCH", "分支指令-switch-值连续时", InstructionTableSwitch::new),
    LOOKUP_SWITCH("LOOKUP_SWITCH", "分支指令-switch-值不连续时", InstructionLookUpSwitch::new),
    INVOKE_INTERFACE("INVOKE_INTERFACE", "特殊操作-接口调用", InstructionInvokeInterface::new),
    INVOKE_DYNAMIC("INVOKE_DYNAMIC", "特殊操作-动态调用", InstructionInvokeDynamic::new),
    MULTI_A_NEW_ARRAY("MULTI_A_NEW_ARRAY", "特殊操作-创建多维数组", InstructionMultiNewArray::new),
    ;

    private final String type;
    private final String desc;

    private final Function<ClassFile, Instruction> createFunction;

    OperandTypeEnum(String type, String desc,
                    Function<ClassFile, Instruction> createFunction) {
        this.type = type;
        this.desc = desc;
        this.createFunction = createFunction;
    }

    public static OperandTypeEnum getByTag(String type) {
        for (var value : OperandTypeEnum.values()) {
            if (value.type.equals(type)) {
                return value;
            }
        }
        return null;
    }
}