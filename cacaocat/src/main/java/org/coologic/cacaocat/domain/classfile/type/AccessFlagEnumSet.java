package org.coologic.cacaocat.domain.classfile.type;

import java.util.EnumSet;

import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.ABSTRACT;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.ANNOTATION;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.BRIDGE;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.ENUM;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.FINAL;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.INTERFACE;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.MANDATED;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.MODULE;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.NATIVE;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.OPEN;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.PRIVATE;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.PROTECTED;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.PUBLIC;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.STATIC;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.STATIC_PHASE;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.STRICT;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.SUPER;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.SYNCHRONIZED;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.SYNTHETIC;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.TRANSIENT;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.TRANSITIVE;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.VARARGS;
import static org.coologic.cacaocat.domain.classfile.type.AccessFlagEnum.VOLATILE;

public class AccessFlagEnumSet {
    public static final EnumSet<AccessFlagEnum> CLASS_TYPE = EnumSet.of(
            PUBLIC,
            FINAL,
            SUPER,
            INTERFACE,
            ABSTRACT,
            SYNTHETIC,
            ANNOTATION,
            ENUM,
            MODULE);

    public static final EnumSet<AccessFlagEnum> INNER_CLASS_TYPE = EnumSet.of(
            PUBLIC,
            PRIVATE,
            PROTECTED,
            STATIC,
            FINAL,
            INTERFACE,
            ABSTRACT,
            SYNTHETIC,
            ANNOTATION,
            ENUM);
    public static final EnumSet<AccessFlagEnum> FIELD_TYPE       = EnumSet.of(
            PUBLIC,
            PRIVATE,
            PROTECTED,
            STATIC,
            FINAL,
            VOLATILE,
            TRANSIENT,
            SYNTHETIC,
            ENUM);

    public static final EnumSet<AccessFlagEnum> METHOD_TYPE = EnumSet.of(
            PUBLIC,
            PRIVATE,
            PROTECTED,
            STATIC,
            FINAL,
            SYNCHRONIZED,
            BRIDGE,
            VARARGS,
            NATIVE,
            ABSTRACT,
            STRICT,
            SYNTHETIC);

    public static final EnumSet<AccessFlagEnum> METHOD_PARAMETERS_TYPE = EnumSet.of(
            FINAL,
            SYNTHETIC,
            MANDATED
    );

    public static final EnumSet<AccessFlagEnum> MODULE_TYPE = EnumSet.of(
            OPEN,
            SYNTHETIC,
            MANDATED
    );

    public static final EnumSet<AccessFlagEnum> REQUIRES_TYPE = EnumSet.of(
            TRANSITIVE,
            STATIC_PHASE,
            SYNTHETIC,
            MANDATED
    );

    public static final EnumSet<AccessFlagEnum> EXPORTS_TYPE = EnumSet.of(
            SYNTHETIC,
            MANDATED
    );

}