package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ModulePackages_attribute {
 * u2 attribute_name_index;
 * u4 attribute_length;
 * u2 package_count;
 * u2 package_index[package_count];
 * }
 */
@Getter
public class AttributeModulePackages extends AbstractAttribute {
    List<Integer> packageIndex = new ArrayList<>();

    public AttributeModulePackages(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int size = input.readUnsignedByte();
        while (packageIndex.size() < size) {
            packageIndex.add(input.readUnsignedByte());
        }
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.MODULE_PACKAGES;
    }
}