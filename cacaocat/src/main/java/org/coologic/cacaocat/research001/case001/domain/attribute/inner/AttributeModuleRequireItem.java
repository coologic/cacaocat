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
 * * u2 opens_count;          -- 等效于 exports 不单独处理
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
public class AttributeModuleRequireItem {
    private int                  requiresIndex;
    private int                  requiresFlagsCode;
    private List<AccessFlagEnum> requiresFlags;
    private int                  requiresVersionIndex;

    public static AttributeModuleRequireItem parseData(DataInput input) throws IOException {
        AttributeModuleRequireItem table = new AttributeModuleRequireItem();
        table.requiresIndex = input.readUnsignedShort();
        table.requiresFlagsCode = input.readUnsignedShort();
        table.requiresFlags = ClassFileParser.parseFlag(table.requiresFlagsCode, AccessFlagEnumSet.REQUIRES_TYPE);
        table.requiresVersionIndex = input.readUnsignedShort();
        return table;
    }
}