package org.coologic.cacaocat.research001.case001;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.FieldInfo;
import org.coologic.cacaocat.research001.case001.domain.MethodInfo;
import org.coologic.cacaocat.research001.case001.domain.constant.Constant;
import org.junit.jupiter.api.Test;

import java.io.DataInput;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ClassFileParser002Test {
    @Test
    void testParse() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/bytecode/case002.class";
        DataInput dataInput = FileReader.readClassFile(path);
        ClassFile classFile = ClassFileParser.parseClassFile(dataInput);
        assertNotNull(classFile);
        String s = classFile.toString();
        assertEquals(0xCAFEBABE, classFile.getMagic());
    }
}