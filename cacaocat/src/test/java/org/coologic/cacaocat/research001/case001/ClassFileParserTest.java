package org.coologic.cacaocat.research001.case001;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.constant.Constant;
import org.junit.jupiter.api.Test;

import java.io.DataInput;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ClassFileParserTest {
    @Test
    void testParse() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parse(dataInput);
        assertNotNull(classFile);
        assertEquals(0xCAFEBABE, classFile.getMagic());
    }

    @Test
    void testPrintConstant() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parse(dataInput);
        for (int i = 0; i < classFile.getConstants().size(); i++) {
            Constant constant = classFile.getConstants().get(i);
            System.out.println(String.format("#%s | %s | %s", i,  constant.type().getByteCodeCode(), constant.getDesc()));
        }
    }

    @Test
    void testFields() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parse(dataInput);
        for (int i = 0; i < classFile.getFields().size(); i++) {
            System.out.println(classFile.getFields().get(i).getDesc());
        }
    }

    @Test
    void testMethods() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parse(dataInput);
        for (int i = 0; i < classFile.getMethods().size(); i++) {
            System.out.println(classFile.getMethods().get(i).getDesc());
        }
    }

    @Test
    void testAttributes() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parse(dataInput);
        for (int i = 0; i < classFile.getAbstractAttributes().size(); i++) {
            System.out.println(classFile.getAbstractAttributes().get(i).getDesc());
        }
    }
}