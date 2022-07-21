package org.coologic.cacaocat.domain.classfile.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FileReader {
    public static DataInput readFile(String path) throws FileNotFoundException {
        return new DataInputStream(new FileInputStream(path));
    }
}