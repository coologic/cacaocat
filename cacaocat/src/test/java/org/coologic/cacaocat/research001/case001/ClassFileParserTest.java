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
        DataInput dataInput = FileReader.readClassFile(
                "/Users/coologic/Documents/coologic/"
                        + "cacaocat/cacaocat/build/classes/java/main/org/coologic/cacaocat/research001/case001/BytecodeTestMeta.class");
        ClassFile classFile = ClassFileParser.parse(dataInput);
        assertNotNull(classFile);
        assertEquals(0xCAFEBABE, classFile.getMagic());
    }

    @Test
    void testPrintConstant() throws IOException {
        DataInput dataInput = FileReader.readClassFile(
                "/Users/coologic/Documents/coologic/"
                        + "cacaocat/cacaocat/build/classes/java/main/org/coologic/cacaocat/research001/case001/BytecodeTestMeta.class");
        ClassFile classFile = ClassFileParser.parse(dataInput);
        for (int i = 0; i < classFile.getConstants().size(); i++) {
            Constant constant = classFile.getConstants().get(i);
            System.out.println(String.format("#%s | %s | %s", i,  constant.type().getByteCodeCode(), constant.getDesc()));
        }
    }
}