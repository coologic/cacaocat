package org.coologic.cacaocat.research001.case001.domain.type;

import java.util.EnumSet;

import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.ABSTRACT;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.ANNOTATION;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.BRIDGE;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.ENUM;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.FINAL;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.INTERFACE;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.MANDATED;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.MODULE;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.NATIVE;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.OPEN;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.PRIVATE;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.PROTECTED;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.PUBLIC;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.STATIC;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.STATIC_PHASE;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.STRICT;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.SUPER;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.SYNCHRONIZED;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.SYNTHETIC;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.TRANSIENT;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.TRANSITIVE;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.VARARGS;
import static org.coologic.cacaocat.research001.case001.domain.type.AccessFlagEnum.VOLATILE;

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