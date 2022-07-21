package org.coologic.cacaocat.domain.classfile.type;

import lombok.Getter;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.entity.attribute.Attribute;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeAnnotationDefault;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeBootstrapMethods;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeCode;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeConstantValue;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeDeprecated;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeEnclosingMethod;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeExceptions;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeInnerClasses;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeLineNumberTable;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeLocalVariableTable;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeLocalVariableTypeTable;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeMethodParameters;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeModule;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeModuleMainClass;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeModulePackages;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeNestHost;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeNestMembers;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeRecord;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeRuntimeInvisibleAnnotations;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeRuntimeInvisibleParameterAnnotations;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeRuntimeInvisibleTypeAnnotations;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeRuntimeVisibleAnnotations;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeRuntimeVisibleParameterAnnotations;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeRuntimeVisibleTypeAnnotations;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeSignature;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeSourceDebugExtension;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeSourceFile;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeStackMapTable;
import org.coologic.cacaocat.domain.classfile.entity.attribute.AttributeSynthetic;

import java.util.function.Function;

@Getter
public enum AttributeTypeEnum {
    SOURCE_FILE("SourceFile", "ClassFile", AttributeSourceFile::new),
    INNER_CLASSES("InnerClasses", "ClassFile", AttributeInnerClasses::new),
    ENCLOSING_METHOD("EnclosingMethod", "ClassFile", AttributeEnclosingMethod::new),
    SOURCE_DEBUG_EXTENSION("SourceDebugExtension", "ClassFile", AttributeSourceDebugExtension::new),
    BOOTSTRAP_METHODS("BootstrapMethods", "ClassFile", AttributeBootstrapMethods::new),
    MODULE("Module", "ClassFile", AttributeModule::new),
    MODULE_PACKAGES("ModulePackages", "ClassFile", AttributeModulePackages::new),
    MODULE_MAIN_CLASS("ModuleMainClass", "ClassFile", AttributeModuleMainClass::new),
    NEST_HOST("NestHost", "ClassFile", AttributeNestHost::new),
    NEST_MEMBERS("NestMembers", "ClassFile", AttributeNestMembers::new),
    RECORD("Record", "ClassFile", AttributeRecord::new),
    CONSTANT_VALUE("ConstantValue", "field_info", AttributeConstantValue::new),
    CODE("Code", "method_info", AttributeCode::new),
    EXCEPTIONS("Exceptions", "method_info", AttributeExceptions::new),
    RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS("RuntimeVisibleParameterAnnotations", "method_info",
            AttributeRuntimeVisibleParameterAnnotations::new),
    RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS("RuntimeInvisibleParameterAnnotations", "method_info",
            AttributeRuntimeInvisibleParameterAnnotations::new),
    RUNTIME_VISIBLE_ANNOTATIONS("RuntimeVisibleAnnotations", "ClassFile,field_info,method_info,record_component_info",
            AttributeRuntimeVisibleAnnotations::new),
    RUNTIME_INVISIBLE_ANNOTATIONS("RuntimeInvisibleAnnotations", "ClassFile,field_info,method_info,record_component_info",
            AttributeRuntimeInvisibleAnnotations::new),
    RUNTIME_VISIBLE_TYPE_ANNOTATIONS("RuntimeVisibleTypeAnnotations", "ClassFile,field_info,method_info,Code,record_component_info",
            AttributeRuntimeVisibleTypeAnnotations::new),
    RUNTIME_INVISIBLE_TYPE_ANNOTATIONS("RuntimeInvisibleTypeAnnotations", "ClassFile,field_info,method_info,Code,record_component_info",
            AttributeRuntimeInvisibleTypeAnnotations::new),
    ANNOTATION_DEFAULT("AnnotationDefault", "method_info", AttributeAnnotationDefault::new),
    METHOD_PARAMETERS("MethodParameters", "method_info", AttributeMethodParameters::new),
    SYNTHETIC("Synthetic", "ClassFile,field_info,method_info", AttributeSynthetic::new),
    DEPRECATED("Deprecated", "ClassFile,field_info,method_info", AttributeDeprecated::new),
    SIGNATURE("Signature", "ClassFile,field_info,method_info,record_component_info", AttributeSignature::new),
    LINE_NUMBER_TABLE("LineNumberTable", "Code", AttributeLineNumberTable::new),
    LOCAL_VARIABLE_TABLE("LocalVariableTable", "Code", AttributeLocalVariableTable::new),
    LOCAL_VARIABLE_TYPE_TABLE("LocalVariableTypeTable", "Code", AttributeLocalVariableTypeTable::new),
    STACK_MAP_TABLE("StackMapTable", "Code", AttributeStackMapTable::new),
    ;
    /**
     * 字节码标准名称
     */
    private final String code;

    private final String usePosition;

    private final Function<ClassFile, Attribute> createFunction;

    AttributeTypeEnum(String code, String usePosition, Function<ClassFile, Attribute> createFunction) {
        this.code = code;
        this.usePosition = usePosition;
        this.createFunction = createFunction;
    }

    public static AttributeTypeEnum getByCode(String tag) {
        for (var value : AttributeTypeEnum.values()) {
            if (value.getCode().equals(tag)) {
                return value;
            }
        }
        return null;
    }
}