package org.coologic.cacaocat.research001.case001;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.constant.Constant;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;
import org.junit.jupiter.api.Test;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ClassFileParserTest {
    @Test
    void testParse() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        assertNotNull(classFile);
        assertEquals(0xCAFEBABE, classFile.getMagic());
    }

    @Test
    void testPrintConstant() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        for (int i = 0; i < classFile.getConstants().size(); i++) {
            Constant constant = classFile.getConstants().get(i);
            System.out.println(String.format("#%s | %s | %s", i,  constant.type().getCode(), constant.getDesc()));
        }
    }

    @Test
    void testFields() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        for (int i = 0; i < classFile.getFields().size(); i++) {
            System.out.println(classFile.getFields().get(i).getDesc());
        }
    }

    @Test
    void testMethods() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        for (int i = 0; i < classFile.getMethods().size(); i++) {
            System.out.println(classFile.getMethods().get(i).getDesc());
        }
    }

    @Test
    void testAttributes() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        for (int i = 0; i < classFile.getAbstractAttributes().size(); i++) {
            System.out.println(classFile.getAbstractAttributes().get(i).getDesc());
        }
    }

    @Test
    void testAttributesTypeEqual() {
        //type()方法正确性
        Arrays.stream(AttributeTypeEnum.values())
                .forEach(o->assertEquals(o, o.getCreateFunction().apply(null).type()));

        //enum 构造映射正确性
        Arrays.stream(AttributeTypeEnum.values())
                .forEach(o->assertEquals("Attribute"  + o.getCode(),
                        o.getCreateFunction().apply(null).getClass().getSimpleName()));
    }

    @Test
    void testConstantTypeEqual() {
        //type()方法正确性
        Arrays.stream(ConstantTypeEnum.values())
                .forEach(o->assertEquals(o, o.getCreateFunction().apply(null).type()));

        //enum 构造映射正确性
        Arrays.stream(ConstantTypeEnum.values())
                .forEach(o->assertEquals("Constant"+o.getCode().replace("CONSTANT_",""),
                        o.getCreateFunction().apply(null).getClass().getSimpleName()));
    }
}