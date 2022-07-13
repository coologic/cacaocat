package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Exceptions_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 *     u2 number_of_exceptions;
 *     u2 exception_index_table[number_of_exceptions];
 * }
 */
@Getter
public class AttributeExceptions extends AbstractAttribute {
    List<Integer> exceptionIndex = new ArrayList<>();

    public AttributeExceptions(ClassFile classFile) {
        super(classFile);
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