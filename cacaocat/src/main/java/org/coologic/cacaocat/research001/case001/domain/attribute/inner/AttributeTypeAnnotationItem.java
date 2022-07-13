package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import graphql.util.Pair;
import lombok.Getter;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
public class AttributeTypeAnnotationItem {
//todo 没写完
    public static AttributeTypeAnnotationItem parseData(DataInput input) throws IOException {
        AttributeTypeAnnotationItem table = new AttributeTypeAnnotationItem();
        //table.typeIndex = input.readUnsignedShort();
        //int numElementValuePairs = input.readUnsignedShort();
        //while (table.elementValuePairs.size() < numElementValuePairs) {
        //    Pair<Integer, AttributeElementValueItem> pair = new Pair<>(input.readUnsignedShort(), AttributeElementValueItem.parseData(input));
        //    table.elementValuePairs.add(pair);
        //}
        return table;
    }
}