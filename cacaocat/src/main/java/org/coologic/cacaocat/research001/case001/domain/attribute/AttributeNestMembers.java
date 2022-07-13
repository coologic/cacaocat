package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NestMembers_attribute {
 *     u2 attribute_name_index;
 *     u4 attribute_length;
 *     u2 number_of_classes;
 *     u2 classes[number_of_classes];
 * }
 */
@Getter
public class AttributeNestMembers extends AbstractAttribute {
    List<Integer> classes = new ArrayList<>();

    public AttributeNestMembers(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int classCount = input.readInt();
        while (classes.size() < classCount) {
            classes.add(input.readUnsignedShort());
        }
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.NEST_MEMBERS;
    }
}