package org.coologic.cacaocat.research001.case001.domain.type;

import lombok.Getter;

//操作数类型
@Getter
public enum OpcodeOperandTypeEnum {
    ZERO_OPERAND("ZERO_OPERAND", "无操作数类型"),
    BYTE_OPERAND("BYTE_OPERAND", "字节操作数类型-若前序操作码为wide则为2字节"),
    SHORT_OPERAND("SHORT_OPERAND", "2字节操作数类型"),
    BRANCH("BRANCH", "分支指令类型操作"),
    TABLE_SWITCH("TABLE_SWITCH", "分支指令-switch-标签直接跳转"),
    LOOKUP_SWITCH("LOOKUP_SWITCH", "分支指令-switch-标签&值跳转"),
    INVOKE_INTERFACE("INVOKE_INTERFACE", "特殊操作-接口调用"),
    INVOKE_DYNAMIC("INVOKE_DYNAMIC", "特殊操作-动态调用"),
    MULTI_A_NEW_ARRAY("MULTI_A_NEW_ARRAY", "特殊操作-创建多维数组"),
    ;

    private final String type;
    private final String desc;

    OpcodeOperandTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static OpcodeOperandTypeEnum getByTag(String type) {
        for (var value : OpcodeOperandTypeEnum.values()) {
            if (value.type.equals(type)) {
                return value;
            }
        }
        return null;
    }
}