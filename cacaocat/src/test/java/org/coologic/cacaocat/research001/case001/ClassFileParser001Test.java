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

class ClassFileParser001Test {
    @Test
    void testParse() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        assertNotNull(classFile);
        String s = classFile.toString();
        assertEquals(0xCAFEBABE, classFile.getMagic());
    }

    @Test
    void testPrintConstant() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        for (int i = 0; i < classFile.getConstants().size(); i++) {
            Constant constant = classFile.getConstants().get(i);
            System.out.println(String.format("#%s | %s | %s", i, constant.type().getCode(), constant.toString()));
        }
    }

    @Test
    void testFields() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        for (int i = 0; i < classFile.getFields().size(); i++) {
            FieldInfo fieldInfo = classFile.getFields().get(i);
            StringBuilder stringBuilder = new StringBuilder();
            fieldInfo.getAccessFlags().forEach(o -> stringBuilder.append(o.getCode()).append(" "));
            stringBuilder.append(fieldInfo.getDescriptor())
                    .append(" ")
                    .append(fieldInfo.getName());
            System.out.println(stringBuilder.toString());
        }
    }

    @Test
    void testMethods() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        for (int i = 0; i < classFile.getMethods().size(); i++) {
            MethodInfo methodInfo = classFile.getMethods().get(i);
            StringBuilder stringBuilder = new StringBuilder();
            methodInfo.getAccessFlags().forEach(o -> stringBuilder.append(o.getCode()).append(" "));
            stringBuilder.append(methodInfo.getDescriptor()).append(" ").append(methodInfo.getName());
            System.out.println(stringBuilder.toString());
        }
    }

    @Test
    void testAttributes() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case001.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        for (int i = 0; i < classFile.getAbstractAttributes().size(); i++) {
            System.out.println(classFile.getAbstractAttributes().get(i).toString());
        }
    }
}