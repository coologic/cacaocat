package org.coologic.cacaocat.research001.case001;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Research {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = FileReader.readClassFile(
                "/Users/coologic/Documents/coologic/"
                        + "cacaocat/cacaocat/build/classes/java/main/org/coologic/cacaocat/research001/case001/BytecodeTestMeta.class");
        ClassFile classFile = ClassFileFactory.generate(fileInputStream);
    }
}