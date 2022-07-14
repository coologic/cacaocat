package org.coologic.cacaocat.research001.case001.domain.type;

import lombok.Getter;

//操作数类型
@Getter
public enum OperandTypeEnum {
    ZERO_OPERAND("ZERO_OPERAND", "无操作数类型"),
    ;

    private final String type;
    private final String desc;

    OperandTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
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