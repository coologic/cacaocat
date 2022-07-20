package org.coologic.cacaocat.research001.case001;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.FieldInfo;
import org.coologic.cacaocat.research001.case001.domain.MethodInfo;
import org.coologic.cacaocat.research001.case001.domain.constant.Constant;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;
import org.coologic.cacaocat.research001.case001.domain.type.OperandTypeEnum;
import org.junit.jupiter.api.Test;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EnumTypeTest {

    @Test
    void testAttributesTypeEqual() {
        //type()非空校验
        Arrays.stream(AttributeTypeEnum.values())
                .forEach(o -> assertNotNull(o.getCreateFunction(), o.getCode()));
        Arrays.stream(AttributeTypeEnum.values())
                .forEach(o -> assertNotNull(o.getCreateFunction().apply(null), o.getCode()));

        //type()方法正确性
        Arrays.stream(AttributeTypeEnum.values())
                .forEach(o -> assertEquals(o, o.getCreateFunction().apply(null).type(), o.getCode()));

        //enum 构造映射正确性
        Arrays.stream(AttributeTypeEnum.values())
                .forEach(o -> assertEquals("Attribute" + o.getCode(),
                        o.getCreateFunction().apply(null).getClass().getSimpleName(), o.getCode()));
    }

    @Test
    void testConstantTypeEqual() {
        //type()非空校验
        Arrays.stream(ConstantTypeEnum.values())
                .forEach(o -> assertNotNull(o.getCreateFunction(), o.getCode()));
        Arrays.stream(ConstantTypeEnum.values())
                .forEach(o -> assertNotNull(o.getCreateFunction().apply(null), o.getCode()));

        //type()方法正确性
        Arrays.stream(ConstantTypeEnum.values())
                .forEach(o -> assertEquals(o, o.getCreateFunction().apply(null).type(), o.getCode()));

        //enum 构造映射正确性
        Arrays.stream(ConstantTypeEnum.values())
                .forEach(o -> assertEquals("Constant" + o.getCode().replace("CONSTANT_", ""),
                        o.getCreateFunction().apply(null).getClass().getSimpleName(), o.getCode()));
    }

    @Test
    void testOperandTypeEqual() {
        //type()非空校验
        Arrays.stream(OperandTypeEnum.values())
                .forEach(o -> assertNotNull(o.getCreateFunction(), o.getType()));
        Arrays.stream(OperandTypeEnum.values())
                .forEach(o -> assertNotNull(o.getCreateFunction().apply(null), o.getType()));

        //type()方法正确性
        Arrays.stream(OperandTypeEnum.values())
                .forEach(o -> assertEquals(o, o.getCreateFunction().apply(null).type().getOperandType(), o.getType()));
    }
}