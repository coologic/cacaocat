package org.coologic.cacaocat.research001.case001.domain.type;

import lombok.Getter;

//指令类型
@Getter
public enum InstructionTypeEnum {
    LOAD_AND_STORE("LoadAndStore ", "加载与存储指令"),
    ARITHMETIC("Arithmetic", "算数指"),
    TYPE_CONVERSION("TypeConversion", "类型转换指令"),
    OBJECT_CREATION_AND_MANIPULATION("ObjectCreationAndManipulation", "对象的创建与访问指令"),
    OPERAND_STACK_MANAGEMENT("OperandStackManagement", "操作数栈管理指令"),
    CONTROL_TRANSFER("ControlTransfer", "控制转移指令"),
    METHOD_INVOCATION_AND_RETURN("MethodInvocationAndReturn", "方法调用与返回指令"),
    THROWING("Throwing", "异常处理指令"),
    SYNCHRONIZATION("Synchronization", "同步指令"),
    ;

    private final String type;
    private final String desc;

    InstructionTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static InstructionTypeEnum getByTag(String type) {
        for (var value : InstructionTypeEnum.values()) {
            if (value.type.equals(type)) {
                return value;
            }
        }
        return null;
    }
}