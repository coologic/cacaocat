package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.ClassFileParser;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnumSet;

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
public class AttributeMethodParametersItem {
    private int nameIndex;
    private int accessFlagsCode;

    //解析后的结果
    private List<AccessFlagEnum> accessFlags;

    public static AttributeMethodParametersItem parseData(DataInput input) throws IOException {
        AttributeMethodParametersItem table = new AttributeMethodParametersItem();
        table.nameIndex = input.readUnsignedShort();
        table.accessFlagsCode = input.readUnsignedShort();
        table.accessFlags = ClassFileParser.parseFlag(table.accessFlagsCode, AccessFlagEnumSet.METHOD_PARAMETERS_TYPE);
        return table;
    }
}