package org.coologic.cacaocat.domain.classfile.entity.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.util.ClassFileParser;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum;
import org.coologic.cacaocat.domain.classfile.type.AccessFlagEnumSet;

import java.io.DataInput;
import java.io.IOException;
import java.util.List;

/**
 * MethodParameters_attribute {
 * *     u2 attribute_name_index;
 * *     u4 attribute_length;
 * *     u1 parameters_count;
 * *     {   u2 name_index;
 * *         u2 access_flags;
 * *     } parameters[parameters_count];
 * * }
 */
@Getter
public class AttributeMethodParametersItem extends AttributeItem {
    private int nameIndex;
    private int accessFlagsCode;
    private List<AccessFlagEnum> accessFlags;

    public String getName() {
        return classFile.getConstants().get(nameIndex).toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        accessFlags.forEach(o -> stringBuilder.append(o.getCode()).append(" "));
        stringBuilder.append(getName());
        return stringBuilder.toString();
    }

    public static AttributeMethodParametersItem parseData(DataInput input,
                                                          ClassFile classFile) throws IOException {
        AttributeMethodParametersItem table = new AttributeMethodParametersItem();
        table.classFile = classFile;
        table.nameIndex = input.readUnsignedShort();
        table.accessFlagsCode = input.readUnsignedShort();
        table.accessFlags = ClassFileParser.parseFlag(table.accessFlagsCode, AccessFlagEnumSet.METHOD_PARAMETERS_TYPE);
        return table;
    }
}