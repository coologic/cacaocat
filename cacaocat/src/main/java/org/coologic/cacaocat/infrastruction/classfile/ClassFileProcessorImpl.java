package org.coologic.cacaocat.infrastruction.classfile;

import org.coologic.cacaocat.domain.classfile.ClassFileProcessor;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.util.ClassFileParser;
import org.coologic.cacaocat.domain.classfile.util.FileReader;
import org.springframework.stereotype.Component;

import java.io.DataInput;
import java.io.IOException;

@Component
public class ClassFileProcessorImpl implements ClassFileProcessor {
    @Override
    public ClassFile parserFile(String path) throws IOException {
        String absolutePath = System.getProperty("user.dir") + path;
        DataInput dataInput = FileReader.readClassFile(absolutePath);
        return ClassFileParser.parseClassFile(dataInput);
    }
}
