package org.coologic.cacaocat.domain.classfile.entity.attribute.inner;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.io.DataInput;
import java.io.IOException;

@Getter
public abstract class AttributeItem {
    @JsonIgnore
    protected ClassFile classFile;
    public static AttributeItem parseData(DataInput input, ClassFile classFile) throws IOException {
        return null;
    }
}