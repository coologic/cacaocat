package org.coologic.cacaocat.domain.classfile.util;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {
    public static DataInput readClassFile(String path) throws FileNotFoundException {
        return new DataInputStream(new FileInputStream(path));
    }
}