package org.coologic.cacaocat.domain.classfile.entity.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * type_annotation {
 *     u1 target_type;
 *     union {
 *         type_parameter_target;
 *         supertype_target;
 *         type_parameter_bound_target;
 *         empty_target;
 *         formal_parameter_target;
 *         throws_target;
 *         localvar_target;
 *         catch_target;
 *         offset_target;
 *         type_argument_target;
 *     } target_info;
 *     type_path target_path;
 *     u2        type_index;
 *     u2        num_element_value_pairs;
 *     {   u2            element_name_index;
 *         element_value value;
 *     } element_value_pairs[num_element_value_pairs];
 * }
 */
@Getter
public class AttributeTypeAnnotationItem extends AttributeItem {
//todo 没写完
    public static AttributeTypeAnnotationItem parseData(DataInput input,
                                                        ClassFile classFile) throws IOException {
        AttributeTypeAnnotationItem table = new AttributeTypeAnnotationItem();
        table.classFile = classFile;
        //table.typeIndex = input.readUnsignedShort();
        //int numElementValuePairs = input.readUnsignedShort();
        //while (table.elementValuePairs.size() < numElementValuePairs) {
        //    Pair<Integer, AttributeElementValueItem> pair = new Pair<>(input.readUnsignedShort(), AttributeElementValueItem.parseData(input));
        //    table.elementValuePairs.add(pair);
        //}
        return table;
    }
}