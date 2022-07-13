package org.coologic.cacaocat.research001.case001.domain.attribute.inner;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;

import java.io.DataInput;
import java.io.IOException;

/**
 * element_value {
 *     u1 tag;
 *     union {
 *         u2 const_value_index;
 *
 *         {   u2 type_name_index;
 *             u2 const_name_index;
 *         } enum_const_value;
 *
 *         u2 class_info_index;
 *
 *         annotation annotation_value;
 *
 *         {   u2            num_values;
 *             element_value values[num_values];
 *         } array_value;
 *     } value;
 * }
 */
@Getter
public class AttributeElementValueItem extends AttributeItem {
    //private int             type_index;
    //private List<Pair<Integer, >> annotations;
//todo 未完成
    public static AttributeElementValueItem parseData(DataInput input, ClassFile classFile) throws IOException {
        AttributeElementValueItem table = new AttributeElementValueItem();
        table.classFile = classFile;
        //table.numAnnotations = input.readUnsignedShort();
        //whil
        //table.descriptorIndex = input.readUnsignedShort();
        //table.attributes = ClassFileParser.parseAttribute(input, classFile);
        return table;
    }
}