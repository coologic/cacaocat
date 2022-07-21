package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;

/**
 * SourceFile_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 *     u2 sourcefile_index;
 * }
 */
@Getter
public class AttributeSourceFile extends AbstractAttribute {
    private int sourceFileIndex;


    public AttributeSourceFile(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        sourceFileIndex = input.readUnsignedShort();
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.SOURCE_FILE;
    }
}