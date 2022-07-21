package org.coologic.cacaocat.domain.classfile.util;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.junit.jupiter.api.Test;

import java.io.DataInput;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ClassFileParser002Test {
    @Test
    void testParse() throws IOException {

        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case002.class";
        DataInput dataInput = FileReader.readFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        assertNotNull(classFile);
        String s = classFile.toString();
        assertEquals(0xCAFEBABE, classFile.getMagic());
    }
}