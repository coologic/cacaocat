package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BootstrapMethods_attribute {
 *  *     u2 attribute_name_index;
 *  *     u4 attribute_length;
 *  *     u2 num_bootstrap_methods;
 *  *     {   u2 bootstrap_method_ref;
 *  *         u2 num_bootstrap_arguments;
 *  *         u2 bootstrap_arguments[num_bootstrap_arguments];
 *  *     } bootstrap_methods[num_bootstrap_methods];
 *  * }
 */
@Getter
public class AttributeBootstrapMethodsItem extends AttributeItem {
    private int           bootstrapMethodRef;
    private int           numBootstrapArguments;
    private List<Integer> bootstrapArguments = new ArrayList<>();

    public static AttributeBootstrapMethodsItem parseData(DataInput input,
                                                          ClassFile classFile) throws IOException {
        AttributeBootstrapMethodsItem table = new AttributeBootstrapMethodsItem();
        table.classFile = classFile;
        table.bootstrapMethodRef = input.readUnsignedShort();
        table.numBootstrapArguments = input.readUnsignedShort();
        while (table.bootstrapArguments.size() < table.numBootstrapArguments) {
            table.bootstrapArguments.add(input.readUnsignedShort());
        }
        return table;
    }
}