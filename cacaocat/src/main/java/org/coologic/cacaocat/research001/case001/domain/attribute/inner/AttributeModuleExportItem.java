package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.ClassFileParser;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnumSet;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Module_attribute {
 * * u2 attribute_name_index;
 * * u4 attribute_length;
 * *
 * * u2 module_name_index;
 * * u2 module_flags;
 * * u2 module_version_index;
 * *
 * * u2 requires_count;
 * * {   u2 requires_index;
 * * u2 requires_flags;
 * * u2 requires_version_index;
 * * } requires[requires_count];
 * *
 * * u2 exports_count;
 * * {   u2 exports_index;
 * * u2 exports_flags;
 * * u2 exports_to_count;
 * * u2 exports_to_index[exports_to_count];
 * * } exports[exports_count];
 * *
 * * u2 opens_count;
 * * {   u2 opens_index;
 * * u2 opens_flags;
 * * u2 opens_to_count;
 * * u2 opens_to_index[opens_to_count];
 * * } opens[opens_count];
 * *
 * * u2 uses_count;
 * * u2 uses_index[uses_count];
 * *
 * * u2 provides_count;
 * * {   u2 provides_index;
 * * u2 provides_with_count;
 * * u2 provides_with_index[provides_with_count];
 * * } provides[provides_count];
 * * }
 */
@Getter
public class AttributeModuleExportItem {
    private int                  nameIndex;
    private int                  flagsCode;
    private List<AccessFlagEnum> exportsFlags;
    private List<Integer>        toIndex = new ArrayList<>();

    public static AttributeModuleExportItem parseData(DataInput input) throws IOException {
        AttributeModuleExportItem table = new AttributeModuleExportItem();
        table.nameIndex = input.readUnsignedShort();
        table.flagsCode = input.readUnsignedShort();
        table.exportsFlags = ClassFileParser.parseFlag(table.flagsCode, AccessFlagEnumSet.EXPORTS_TYPE);

        int exportsToCount = input.readUnsignedShort();
        while (table.toIndex.size() < exportsToCount) {
            table.toIndex.add(input.readUnsignedShort());
        }
        return table;
    }
}