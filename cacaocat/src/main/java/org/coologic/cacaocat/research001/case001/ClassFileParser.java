package org.coologic.cacaocat.research001.case001;

import org.coologic.cacaocat.research001.case001.domain.AttributeInfo;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.FieldInfo;
import org.coologic.cacaocat.research001.case001.domain.MethodInfo;
import org.coologic.cacaocat.research001.case001.domain.constant.Constant;
import org.coologic.cacaocat.research001.case001.domain.constant.ConstantUtf8;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum;
import org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnumSet;
import org.coologic.cacaocat.research001.case001.domain.type.ConstantTypeEnum;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class ClassFileParser {

    public static ClassFile parse(DataInput input) throws IOException {
        ClassFile classFile = new ClassFile();

        //下面的顺序一定不能错
        classFile.setMagic(input.readInt());
        classFile.setMinorVersion(input.readUnsignedShort());
        classFile.setMajorVersion(input.readUnsignedShort());

        //常量池处理
        List<Constant> constants = parseConstantPool(input);
        classFile.setConstants(constants);

        classFile.setAccessFlagTag(input.readUnsignedShort());
        classFile.setAccessFlags(parseFlag(classFile.getAccessFlagTag(), AccessFlagEnumSet.CLASS_TYPE));
        classFile.setThisClass(input.readUnsignedShort());
        classFile.setSuperClass(input.readUnsignedShort());

        //接口索引
        List<Integer> interfaces = parseInterface(input);
        classFile.setInterfaces(interfaces);

        List<FieldInfo> fields = parseField(input);
        classFile.setFields(fields);

        List<MethodInfo> methods = parseMethod(input);
        classFile.setMethods(methods);

        List<AttributeInfo> attributeInfos = parseAttribute(input);
        classFile.setAttributes(attributeInfos);

        return classFile;
    }

    public static List<MethodInfo> parseMethod(DataInput input) throws IOException {
        int methodCount = input.readUnsignedShort();
        List<MethodInfo> methodInfos = new ArrayList<>();
        while (methodInfos.size() < methodCount) {
            MethodInfo methodInfo = new MethodInfo();
            int tag = input.readUnsignedShort();
            methodInfo.setAccessFlagTag(tag);
            methodInfo.setAccessFlags(parseFlag(methodInfo.getAccessFlagTag(), AccessFlagEnumSet.METHOD_TYPE));
            methodInfo.setNameIndex(input.readUnsignedShort());
            methodInfo.setDescriptorIndex(input.readUnsignedShort());
            List<AttributeInfo> attributeInfos = parseAttribute(input);
            methodInfo.setAttributes(attributeInfos);
            methodInfos.add(methodInfo);
        }
        return methodInfos;
    }

    public static List<AttributeInfo> parseAttribute(DataInput input) throws IOException {
        int attributeCount = input.readUnsignedShort();
        List<AttributeInfo> attributeInfos = new ArrayList<>(attributeCount);
        while (attributeInfos.size() < attributeCount) {
            AttributeInfo attributeInfo = new AttributeInfo();
            attributeInfo.setAttributeNameIndex(input.readUnsignedShort());
            attributeInfo.setAttributeLength(input.readInt());
            //todo 先跳过具体解析
            input.skipBytes(attributeInfo.getAttributeLength());
            attributeInfos.add(attributeInfo);
        }
        return attributeInfos;
    }

    public static List<FieldInfo> parseField(DataInput input) throws IOException {
        int fieldCount = input.readUnsignedShort();
        List<FieldInfo> fieldInfos = new ArrayList<>(fieldCount);
        while (fieldInfos.size() < fieldCount) {
            FieldInfo fieldInfo = new FieldInfo();
            fieldInfo.setAccessFlagTag(input.readUnsignedShort());
            fieldInfo.setAccessFlags(parseFlag(fieldInfo.getAccessFlagTag(), AccessFlagEnumSet.FIELD_TYPE));
            fieldInfo.setNameIndex(input.readUnsignedShort());
            fieldInfo.setDescriptorIndex(input.readUnsignedShort());
            List<AttributeInfo> attributeInfos = parseAttribute(input);
            fieldInfo.setAttributes(attributeInfos);
            fieldInfos.add(fieldInfo);
        }
        return fieldInfos;
    }

    public static List<Constant> parseConstantPool(DataInput input) throws IOException {
        int constantCount = input.readUnsignedShort();
        List<Constant> constants = new ArrayList<>(constantCount);
        //处理一下第0项常量池的数据
        constants.add(ConstantUtf8.rootValue());
        while (constants.size() < constantCount) {
            int tag = input.readUnsignedByte();
            ConstantTypeEnum constantType = ConstantTypeEnum.getByTag(tag);
            assert constantType != null;
            Constant constant = constantType.getCreateFunction().get();
            constant.parse(input, constants.size());
            constants.add(constant);
            if (constantType == ConstantTypeEnum.LONG || constantType == ConstantTypeEnum.DOUBLE) {
                //这两个类型比较特殊，会占用常量池两个size。为了方便处理我们其实在第一个位置时已经完整读取了8byte的空间，所以两个位置存一样的数据即可
                constants.add(constant);
            }
        }
        return constants;
    }

    public static List<Integer> parseInterface(DataInput input) throws IOException {
        int interfaceCount = input.readUnsignedShort();
        List<Integer> interfaces = new ArrayList<>(interfaceCount);
        while (interfaces.size() < interfaceCount) {
            interfaces.add(input.readUnsignedShort());
        }
        return interfaces;
    }

    public static List<AccessFlagEnum> parseFlag(int flagTag, EnumSet<AccessFlagEnum> flagTypeList) {
        List<AccessFlagEnum> result = new ArrayList<>();
        for (var flag : flagTypeList) {
            if((flag.getTag() & flagTag) != 0) {
                result.add(flag);
            }
        }

        int sumTag = 0;
        for (var r : result) {
            sumTag += r.getTag();
        }
        assert sumTag == flagTag;
        return result;
    }
}