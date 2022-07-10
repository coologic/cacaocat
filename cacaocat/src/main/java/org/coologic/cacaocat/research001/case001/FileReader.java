package org.coologic.cacaocat.research001.case001;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {
    public static DataInput readClassFile(String path) throws FileNotFoundException {
        return new DataInputStream(new FileInputStream(path));
    }
}