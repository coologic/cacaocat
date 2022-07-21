package org.coologic.cacaocat.domain.classfile;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.io.IOException;

public interface ClassFileProcessor {
    ClassFile parserFile(String path) throws IOException;
}
