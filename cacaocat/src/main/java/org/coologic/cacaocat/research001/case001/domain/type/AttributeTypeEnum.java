package org.coologic.cacaocat.research001.case001.domain.type;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.Attribute;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeBootstrapMethods;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeCode;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeConstantValue;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeEnclosingMethod;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeExceptions;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeInnerClasses;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeLineNumberTable;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeLocalVariableTable;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeMethodParameters;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeModule;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeModuleMainClass;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeModulePackages;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeNestHost;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeNestMembers;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeRecord;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeRuntimeVisibleParameterAnnotations;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeSourceDebugExtension;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeSourceFile;

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
    RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS("RuntimeInvisibleParameterAnnotations", "method_info", null),
    ANNOTATION_DEFAULT("AnnotationDefault", "method_info", null),
    METHOD_PARAMETERS("MethodParameters", "method_info", AttributeMethodParameters::new),
    SYNTHETIC("Synthetic", "ClassFile,field_info,method_info", null),
    DEPRECATED("Deprecated", "ClassFile,field_info,method_info", null),
    SIGNATURE("Signature", "ClassFile,field_info,method_info,record_component_info", null),
    RUNTIME_VISIBLE_ANNOTATIONS("RuntimeVisibleAnnotations", "ClassFile,field_info,method_info,record_component_info", null),
    RUNTIME_INVISIBLE_ANNOTATIONS("RuntimeInvisibleAnnotations", "ClassFile,field_info,method_info,record_component_info", null),
    LINE_NUMBER_TABLE("LineNumberTable", "Code", AttributeLineNumberTable::new),
    LOCAL_VARIABLE_TABLE("LocalVariableTable", "Code", AttributeLocalVariableTable::new),
    LOCAL_VARIABLE_TYPE_TABLE("LocalVariableTypeTable", "Code", null),
    STACK_MAP_TABLE("StackMapTable", "Code", null),
    RUNTIME_VISIBLE_TYPE_ANNOTATIONS("RuntimeVisibleTypeAnnotations", "ClassFile,field_info,method_info,Code,record_component_info", null),
    RUNTIME_INVISIBLE_TYPE_ANNOTATIONS("RuntimeInvisibleTypeAnnotations", "ClassFile,field_info,method_info,Code,record_component_info",
            null),
    ;
    /**
     * 字节码标准名称
     */
    private final String name;

    private final String usePosition;

    private final Function<ClassFile, Attribute> createFunction;

    AttributeTypeEnum(String name, String usePosition, Function<ClassFile, Attribute> createFunction) {
        this.name = name;
        this.usePosition = usePosition;
        this.createFunction = createFunction;
    }

    public static AttributeTypeEnum getByAttributeName(String tag) {
        for (var value : AttributeTypeEnum.values()) {
            if (value.getName().equals(tag)) {
                return value;
            }
        }
        return null;
    }
}