package org.coologic.cacaocat.domain.classfile.util;

import java.io.DataInputStream;
import java.io.InputStream;

public class ObservableByteArrayInputStream extends DataInputStream {
    int pos = 0;

    /**
     * Creates a DataInputStream that uses the specified
     * underlying InputStream.
     *
     * @param in the specified input stream
     */
    public ObservableByteArrayInputStream(InputStream in) {
        super(in);
    }

    public int getPosition() {
        return pos;
    }
}