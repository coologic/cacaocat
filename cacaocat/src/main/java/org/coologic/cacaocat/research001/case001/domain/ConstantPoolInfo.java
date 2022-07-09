package org.coologic.cacaocat.research001.case001.domain;

import graphql.execution.nextgen.result.ObjectExecutionResultNode;
import org.coologic.cacaocat.research001.case001.domain.constant.Constant;

import java.util.List;

public class ConstantPoolInfo {
    /**
     * 常量池的类型 todo 后面改成枚举
     *
         Constant Kind	Tag	Section
         CONSTANT_Class	7	§4.4.1
         CONSTANT_Fieldref	9	§4.4.2
         CONSTANT_Methodref	10	§4.4.2
         CONSTANT_InterfaceMethodref	11	§4.4.2
         CONSTANT_String	8	§4.4.3
         CONSTANT_Integer	3	§4.4.4
         CONSTANT_Float	4	§4.4.4
         CONSTANT_Long	5	§4.4.5
         CONSTANT_Double	6	§4.4.5
         CONSTANT_NameAndType	12	§4.4.6
         CONSTANT_Utf8	1	§4.4.7
         CONSTANT_MethodHandle	15	§4.4.8
         CONSTANT_MethodType	16	§4.4.9
         CONSTANT_Dynamic	17	§4.4.10
         CONSTANT_InvokeDynamic	18	§4.4.10
         CONSTANT_Module	19	§4.4.11
         CONSTANT_Package	20	§4.4.12
     */
    int           tag;

    /**
     * todo 这里要动态处理了，根据不同的类型
     * 常量信息
     */
    List<Constant> info;
}