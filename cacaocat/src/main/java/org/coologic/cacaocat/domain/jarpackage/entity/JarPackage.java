package org.coologic.cacaocat.domain.jarpackage.entity;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.util.HashMap;
import java.util.Map;

@Getter
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
