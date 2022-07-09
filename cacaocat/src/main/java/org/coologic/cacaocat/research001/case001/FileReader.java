package org.coologic.cacaocat.research001.case001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {
    public static FileInputStream readClassFile(String path) throws FileNotFoundException {
        return new FileInputStream(path);
    }
}