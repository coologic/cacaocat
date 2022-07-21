package org.coologic.cacaocat.domain.jarpackage.entity;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.util.HashMap;
import java.util.Map;

public class JarPackage {
    /**
     * key： class file name
     * value： class file
     */
    Map<String, ClassFile> classFiles = new HashMap<>();

    public void addClassFile(ClassFile classFile) {
        classFiles.put(classFile.getConstants().get(classFile.getThisClass()).toString(), classFile);
    }

    public ClassFile getClassFile(String className) {
        return classFiles.get(className);
    }
}
