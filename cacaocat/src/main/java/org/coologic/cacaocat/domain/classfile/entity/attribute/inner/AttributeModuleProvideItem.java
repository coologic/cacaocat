package org.coologic.cacaocat.domain.classfile.entity.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

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
public class AttributeModuleProvideItem extends AttributeItem {
    private int           nameIndex;
    private List<Integer> withIndex = new ArrayList<>();

    public static AttributeModuleProvideItem parseData(DataInput input,
                                                       ClassFile classFile) throws IOException {
        AttributeModuleProvideItem table = new AttributeModuleProvideItem();
        table.classFile = classFile;
        table.nameIndex = input.readUnsignedShort();

        int exportsToCount = input.readUnsignedShort();
        while (table.withIndex.size() < exportsToCount) {
            table.withIndex.add(input.readUnsignedShort());
        }
        return table;
    }
}