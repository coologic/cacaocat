package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exceptions_attribute {
 * u2 attribute_name_index;
 * u4 attribute_length;
 * u2 number_of_exceptions;
 * u2 exception_index_table[number_of_exceptions];
 * }
 */
@Getter
public class AttributeExceptions extends AbstractAttribute {
    List<Integer> exceptionIndex = new ArrayList<>();

    public AttributeExceptions(ClassFile classFile) {
        super(classFile);
    }

    public List<String> getExceptions() {
        return exceptionIndex.stream().map(ei -> classFile.getConstants().get(ei).toString()).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return String.join("\n", getExceptions());
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int exceptionCount = input.readUnsignedShort();
        while (exceptionIndex.size() < exceptionCount) {
            exceptionIndex.add(input.readUnsignedShort());
        }
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.EXCEPTIONS;
    }
}