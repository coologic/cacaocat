package org.coologic.cacaocat.infrastruction.jarpackage;

import org.coologic.cacaocat.domain.classfile.util.FileReader;
import org.coologic.cacaocat.domain.jarpackage.JarPackageProcessor;
import org.coologic.cacaocat.domain.jarpackage.entity.JarPackage;
import org.coologic.cacaocat.domain.jarpackage.util.JarPackageParser;

import java.io.DataInput;
import java.io.IOException;

public class JarPackageProcessorImpl implements JarPackageProcessor {
    @Override
    public JarPackage parseJarPackage(String path) {
        JarPackage jarPackage;
        try {
            String absolutePath = System.getProperty("user.dir") + path;
            DataInput dataInput = FileReader.readFile(absolutePath);
            jarPackage = JarPackageParser.parseJarPackage(dataInput);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        return jarPackage;
    }
}
