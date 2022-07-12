package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.ClassFileParser;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeMethodParametersItem;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeModuleExportItem;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeModuleProvideItem;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeModuleRequireItem;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnumSet;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Module_attribute {
 * u2 attribute_name_index;
 * u4 attribute_length;
 *
 * u2 module_name_index;
 * u2 module_flags;
 * u2 module_version_index;
 *
 * u2 requires_count;
 * {   u2 requires_index;
 * u2 requires_flags;
 * u2 requires_version_index;
 * } requires[requires_count];
 *
 * u2 exports_count;
 * {   u2 exports_index;
 * u2 exports_flags;
 * u2 exports_to_count;
 * u2 exports_to_index[exports_to_count];
 * } exports[exports_count];
 *
 * u2 opens_count;
 * {   u2 opens_index;
 * u2 opens_flags;
 * u2 opens_to_count;
 * u2 opens_to_index[opens_to_count];
 * } opens[opens_count];
 *
 * u2 uses_count;
 * u2 uses_index[uses_count];
 *
 * u2 provides_count;
 * {   u2 provides_index;
 * u2 provides_with_count;
 * u2 provides_with_index[provides_with_count];
 * } provides[provides_count];
 * }
 */
@Getter
public class AttributeModule extends AbstractAttribute {
    int                  nameIndex;
    int                  moduleFlagsCode;
    List<AccessFlagEnum> moduleFlags;
    int                  moduleVersionIndex;

    List<AttributeModuleRequireItem> requires = new ArrayList<>();
    List<AttributeModuleExportItem>  exports  = new ArrayList<>();

    //结构与 requires 一样  不单独创建处理
    List<AttributeModuleRequireItem> opens     = new ArrayList<>();
    List<Integer>                    usesIndex = new ArrayList<>();

    List<AttributeModuleProvideItem> provides = new ArrayList<>();

    public AttributeModule(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        nameIndex = input.readUnsignedByte();
        moduleFlagsCode = input.readUnsignedByte();
        moduleFlags = ClassFileParser.parseFlag(moduleFlagsCode, AccessFlagEnumSet.MODULE_TYPE);

        int size = input.readUnsignedByte();
        while (requires.size() < size) {
            requires.add(AttributeModuleRequireItem.parseData(input));
        }
        size = input.readUnsignedByte();
        while (exports.size() < size) {
            exports.add(AttributeModuleExportItem.parseData(input));
        }
        size = input.readUnsignedByte();
        while (opens.size() < size) {
            opens.add(AttributeModuleRequireItem.parseData(input));
        }
        size = input.readUnsignedByte();
        while (usesIndex.size() < size) {
            usesIndex.add(input.readUnsignedByte());
        }
        size = input.readUnsignedByte();
        while (provides.size() < size) {
            provides.add(AttributeModuleProvideItem.parseData(input));
        }
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.MODULE;
    }
}