package org.coologic.cacaocat.research001.case001.domain.attribute;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeBootstrapMethodsItem;
import org.coologic.cacaocat.research001.case001.domain.attribute.inner.AttributeLineNumberItem;
import org.coologic.cacaocat.research001.case001.domain.type.AttributeTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BootstrapMethods_attribute {
 * u2 attribute_name_index;
 * u4 attribute_length;
 * u2 num_bootstrap_methods;
 * {   u2 bootstrap_method_ref;
 * u2 num_bootstrap_arguments;
 * u2 bootstrap_arguments[num_bootstrap_arguments];
 * } bootstrap_methods[num_bootstrap_methods];
 * }
 */
@Getter
public class AttributeBootstrapMethods extends AbstractAttribute {
    List<AttributeBootstrapMethodsItem> items = new ArrayList<>();

    public AttributeBootstrapMethods(ClassFile classFile) {
        super(classFile);
    }

    @Override
    public void parseData(DataInput input) throws IOException {
        int length = input.readUnsignedShort();
        while (items.size() < length) {
            items.add(AttributeBootstrapMethodsItem.parseData(input));
        }
    }

    @Override
    public AttributeTypeEnum type() {
        return AttributeTypeEnum.BOOTSTRAP_METHODS;
    }
}