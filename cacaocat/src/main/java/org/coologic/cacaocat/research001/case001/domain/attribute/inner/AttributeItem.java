package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

@Getter
public abstract class AttributeItem {
    protected ClassFile classFile;
    public static AttributeItem parseData(DataInput input, ClassFile classFile) throws IOException {
        return null;
    }
}