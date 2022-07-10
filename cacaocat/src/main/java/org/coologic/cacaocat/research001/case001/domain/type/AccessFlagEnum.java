package org.coologic.cacaocat.research001.case001.domain.type;

import lombok.Getter;

@Getter
public enum AccessFlagEnum {
    //这里tag是有复用的，不同场景下语义不同，场景在：AccessFlagEnumSet 类里做了聚合处理
    PUBLIC(0x0001, "ACC_PUBLIC", "public"),
    PRIVATE(0x0002, "ACC_PRIVATE", "private"),
    PROTECTED(0x0004, "ACC_PROTECTED", "protected"),
    STATIC(0x0008, "ACC_STATIC", "static"),

    FINAL(0x0010, "ACC_FINAL", "final"),
    SUPER(0x0020, "ACC_SUPER", "super"),
    SYNCHRONIZED(0x0020, "ACC_SYNCHRONIZED", "synchronized"),
    TRANSITIVE(0x0020, "ACC_TRANSITIVE", "transitive"),
    OPEN(0x0020, "ACC_OPEN", "open"),
    VOLATILE(0x0040, "ACC_VOLATILE", "volatile"),
    STATIC_PHASE(0x0040, "ACC_STATIC_PHASE", "static_phase"),
    BRIDGE(0x0040, "ACC_BRIDGE", "bridge"),
    TRANSIENT(0x0080, "ACC_TRANSIENT", "transient"),
    VARARGS(0x0080, "ACC_VARARGS", "varargs"),

    NATIVE(0x0100, "ACC_NATIVE", "native"),
    ABSTRACT(0x0400, "ACC_ABSTRACT", "abstract"),
    STRICT(0x0800, "ACC_STRICT", "strict"),

    SYNTHETIC(0x1000, "ACC_SYNTHETIC", "synthetic"),
    INTERFACE(0x0200, "ACC_INTERFACE", "interface"),
    ANNOTATION(0x2000, "ACC_ANNOTATION", "annotation"),
    ENUM(0x4000, "ACC_ENUM", "enum"),
    MODULE(0x8000, "ACC_MODULE", "module"),
    MANDATED(0x8000, "ACC_MANDATED", "mandated"),
    ;

    /**
     * 常量类型tag
     */
    private final int    tag;
    /**
     * 常量类型的字节码标准名称
     */
    private final String byteCodeCode;

    private final String code;

    AccessFlagEnum(int tag, String byteCodeCode, String code) {
        this.tag = tag;
        this.byteCodeCode = byteCodeCode;
        this.code = code;
    }
}