package org.coologic.cacaocat.research001.case001;

import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.FileInputStream;

public class ClassFileFactory {
    public static ClassFile generate(FileInputStream clazzFile) {
        ClassFile classFile = new ClassFile();
        return classFile;
    }
}