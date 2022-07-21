package org.coologic.cacaocat.application.classfile;

import lombok.AllArgsConstructor;
import org.coologic.cacaocat.domain.classfile.ClassFileProcessor;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClassFileServiceImpl implements ClassFileService {

    private ClassFileProcessor classFileProcessor;

    @Override
    public ClassFile parse(String path) {
        return classFileProcessor.parseFile(path);
    }

}
