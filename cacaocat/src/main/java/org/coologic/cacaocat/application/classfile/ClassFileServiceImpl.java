package org.coologic.cacaocat.application.classfile;

import lombok.AllArgsConstructor;
import org.coologic.cacaocat.domain.classfile.ClassFileProcessor;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@AllArgsConstructor
public class ClassFileServiceImpl implements ClassFileService {

    private ClassFileProcessor classFileProcessor;

    @Override
    public ClassFile parse(String path) {
        try {
            return classFileProcessor.parserFile(path);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

}
