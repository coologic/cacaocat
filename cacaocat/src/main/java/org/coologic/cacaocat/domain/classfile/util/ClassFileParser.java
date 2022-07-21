package org.coologic.cacaocat.domain.classfile.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.entity.FieldInfo;
import org.coologic.cacaocat.domain.classfile.entity.MethodInfo;
import org.coologic.cacaocat.domain.classfile.entity.attribute.Attribute;
import org.coologic.cacaocat.domain.classfile.entity.constant.Constant;
import org.coologic.cacaocat.domain.classfile.entity.constant.ConstantUtf8;
import org.coologic.cacaocat.domain.classfile.entity.instruction.Instruction;
import org.coologic.cacaocat.domain.classfile.type.*;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class ClassFileParser {

    public static ClassFile parseClassFile(DataInput input) throws IOException {
        ClassFile classFile = new ClassFile();

        //下面的顺序一定不能错
        classFile.setMagic(input.readInt());
        classFile.setMinorVersion(input.readUnsignedShort());
        classFile.setMajorVersion(input.readUnsignedShort());

        //常量池处理
        List<Constant> constants = parseConstantPool(input, classFile);
        classFile.setConstants(constants);

        classFile.setAccessFlagTag(input.readUnsignedShort());
        classFile.setAccessFlags(parseFlag(classFile.getAccessFlagTag(), AccessFlagEnumSet.CLASS_TYPE));
        classFile.setThisClass(input.readUnsignedShort());
        classFile.setSuperClass(input.readUnsignedShort());

        //接口索引
        List<Integer> interfaces = parseInterface(input);
        classFile.setInterfaces(interfaces);

        List<FieldInfo> fields = parseField(input, classFile);
        classFile.setFields(fields);

        List<MethodInfo> methods = parseMethod(input, classFile);
        classFile.setMethods(methods);

        List<Attribute> attributes = parseAttribute(input, classFile);
        classFile.setAbstractAttributes(attributes);

        return classFile;
    }

    public static List<MethodInfo> parseMethod(DataInput input, ClassFile classFile) throws IOException {
        int methodCount = input.readUnsignedShort();
        List<MethodInfo> methodInfos = new ArrayList<>();
        while (methodInfos.size() < methodCount) {
            MethodInfo methodInfo = new MethodInfo(classFile);
            int tag = input.readUnsignedShort();
            methodInfo.setAccessFlagTag(tag);
            methodInfo.setAccessFlags(parseFlag(methodInfo.getAccessFlagTag(), AccessFlagEnumSet.METHOD_TYPE));
            methodInfo.setNameIndex(input.readUnsignedShort());
            methodInfo.setDescriptorIndex(input.readUnsignedShort());
            List<Attribute> attributes = parseAttribute(input, classFile);
            methodInfo.setAbstractAttributes(attributes);
            methodInfos.add(methodInfo);
        }
        return methodInfos;
    }

    public static List<Attribute> parseAttribute(DataInput input, ClassFile classFile) throws IOException {
        int attributeCount = input.readUnsignedShort();
        List<Attribute> abstractAttributes = new ArrayList<>(attributeCount);
        while (abstractAttributes.size() < attributeCount) {
            int nameIndex = input.readUnsignedShort();
            String attributeName = classFile.getConstants().get(nameIndex).toString();
            AttributeTypeEnum attributeTypeEnum = AttributeTypeEnum.getByCode(attributeName);
            if (attributeTypeEnum == null) {
                System.out.println("处理失败，未知的attribute类型,attributeName:" + attributeName);
            }
            Function<ClassFile, Attribute> createFunction = Objects.requireNonNull(attributeTypeEnum).getCreateFunction();
            if (createFunction == null) {
                System.out.println("处理失败，attribute缺少对应构建器,attributeName:" + attributeName);
            }
            Attribute attribute = createFunction.apply(classFile);
            if (attribute.type() != attributeTypeEnum) {
                System.out.println("处理错误，attribute类型代码逻辑错误,返回的type:" + attribute.type().getCode()
                        + ",实际类型:" + attributeTypeEnum.getCode());
            }
            attribute.parse(input);
            abstractAttributes.add(attribute);
        }
        return abstractAttributes;
    }

    public static List<FieldInfo> parseField(DataInput input, ClassFile classFile) throws IOException {
        int fieldCount = input.readUnsignedShort();
        List<FieldInfo> fieldInfos = new ArrayList<>(fieldCount);
        while (fieldInfos.size() < fieldCount) {
            FieldInfo fieldInfo = new FieldInfo(classFile);
            fieldInfo.setAccessFlagTag(input.readUnsignedShort());
            fieldInfo.setAccessFlags(parseFlag(fieldInfo.getAccessFlagTag(), AccessFlagEnumSet.FIELD_TYPE));
            fieldInfo.setNameIndex(input.readUnsignedShort());
            fieldInfo.setDescriptorIndex(input.readUnsignedShort());
            List<Attribute> attributes = parseAttribute(input, classFile);
            fieldInfo.setAttributes(attributes);
            fieldInfos.add(fieldInfo);
        }
        return fieldInfos;
    }

    public static List<Constant> parseConstantPool(DataInput input, ClassFile classFile) throws IOException {
        int constantCount = input.readUnsignedShort();
        List<Constant> constants = new ArrayList<>(constantCount);
        //处理一下第0项常量池的数据
        constants.add(ConstantUtf8.rootValue(classFile));
        while (constants.size() < constantCount) {
            int tag = input.readUnsignedByte();
            ConstantTypeEnum constantType = ConstantTypeEnum.getByTag(tag);
            assert constantType != null;
            Constant constant = constantType.getCreateFunction().apply(classFile);
            constant.parse(input);
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
            if ((flag.getTag() & flagTag) != 0) {
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

    public static List<Instruction> parseInstruction(DataInput input, ClassFile classFile, int maxLength) throws IOException {
        int currentSize = 0;
        boolean wide = false;
        List<Instruction> instructions = new ArrayList<>();
        while (currentSize < maxLength) {
            OpcodeTypeEnum opcodeTypeEnum = OpcodeTypeEnum.getByTag(input.readUnsignedByte());
            Instruction instruction = opcodeTypeEnum.getOperandType().getCreateFunction().apply(classFile);
            instruction.parse(input, opcodeTypeEnum, wide, currentSize);
            instructions.add(instruction);
            //下一个是否wide
            wide = opcodeTypeEnum == OpcodeTypeEnum.WIDE;
            //索引位置更新更新
            currentSize += instruction.size();
        }
        return instructions;
    }
}