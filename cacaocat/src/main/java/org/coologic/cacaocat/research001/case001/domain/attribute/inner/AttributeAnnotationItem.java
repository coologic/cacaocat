package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import graphql.util.Pair;
import lombok.Getter;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * annotation {
 *     u2 type_index;
 *     u2 num_element_value_pairs;
 *     {   u2            element_name_index;
 *         element_value value;
 *     } element_value_pairs[num_element_value_pairs];
 * }
 */
@Getter
public class AttributeAnnotationItem {
    private int                                            typeIndex;
    private List<Pair<Integer,AttributeElementValueItem >> elementValuePairs = new ArrayList<>();

    public static AttributeAnnotationItem parseData(DataInput input) throws IOException {
        AttributeAnnotationItem table = new AttributeAnnotationItem();
        table.typeIndex = input.readUnsignedShort();
        int numElementValuePairs = input.readUnsignedShort();
        while (table.elementValuePairs.size() < numElementValuePairs) {
            Pair<Integer, AttributeElementValueItem> pair = new Pair<>(input.readUnsignedShort(), AttributeElementValueItem.parseData(input));
            table.elementValuePairs.add(pair);
        }
        return table;
    }
}