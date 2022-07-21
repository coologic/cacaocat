package org.coologic.cacaocat.application.classfile;

import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

public interface ClassFileService {

    ClassFile parse(String path);
}
