package org.coologic.cacaocat.domain.classfile;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

public interface ClassFileProcessor {
    ClassFile parseFile(String path);
}
