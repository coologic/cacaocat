package org.coologic.cacaocat.domain.classfile.entity.attribute;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.type.AttributeTypeEnum;

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
public class AttributeModuleMainClass extends AbstractAttribute {
    List<Integer> packageIndex = new ArrayList<>();

    public AttributeModuleMainClass(ClassFile classFile) {
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
        return AttributeTypeEnum.MODULE_MAIN_CLASS;
    }
}