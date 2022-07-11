package org.coologic.cacaocat.research001.case001.domain.type;

import lombok.Getter;
import org.coologic.cacaocat.research001.case001.domain.ClassFile;
import org.coologic.cacaocat.research001.case001.domain.attribute.Attribute;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeCode;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeLineNumberTable;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeLocalVariableTable;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeMethodParameters;
import org.coologic.cacaocat.research001.case001.domain.attribute.AttributeSourceFile;

import java.util.function.Function;

@Getter
public enum AttributeTypeEnum {
    SOURCE_FILE("SourceFile", "ClassFile", AttributeSourceFile::new),
    INNER_CLASSES("InnerClasses", "ClassFile", null),
    ENCLOSING_METHOD("EnclosingMethod", "ClassFile", null),
    SOURCE_DEBUG_EXTENSION("SourceDebugExtension", "ClassFile", null),
    BOOTSTRAP_METHODS("BootstrapMethods", "ClassFile", null),
    MODULE("Module", "ClassFile", null),
    MODULE_PACKAGES("ModulePackages", "ClassFile", null),
    MODULE_MAIN_CLASS("ModuleMainClass", "ClassFile", null),
    NEST_HOST("NestHost", "ClassFile", null),
    NEST_MEMBERS("NestMembers", "ClassFile", null),
    RECORD("Record", "ClassFile", null),
    CONSTANT_VALUE("ConstantValue", "field_info", null),
    CODE("Code", "method_info", AttributeCode::new),
    EXCEPTIONS("Exceptions", "method_info", null),
    RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS("RuntimeVisibleParameterAnnotations", "method_info", null),
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