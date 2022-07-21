package org.coologic.cacaocat.domain.classfile.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.jar.JarFile;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FileReader {
    public static DataInput readClassFile(String path) throws FileNotFoundException {
        return new DataInputStream(new FileInputStream(path));
    }

    public static JarFile readJarFile(String path) throws IOException {
        return new JarFile(new File(path));
    }
}