package org.coologic.cacaocat.research001.case001.domain.type;

import lombok.Getter;

//操作码类型
@Getter
public enum OpcodeTypeEnum {
    NOP(0, "nop", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.NO_TYPE, "空操作"),
    ACONST_NULL(1, "aconst_null", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_M1(2, "iconst_m1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_0(3, "iconst_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_1(4, "iconst_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_2(5, "iconst_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_3(6, "iconst_3", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_4(7, "iconst_4", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_5(8, "iconst_5", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LCONST_0(9, "lconst_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LCONST_1(10, "lconst_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FCONST_0(11, "fconst_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FCONST_1(12, "fconst_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FCONST_2(13, "fconst_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DCONST_0(14, "dconst_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DCONST_1(15, "dconst_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    BIPUSH(16, "bipush", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    SIPUSH(17, "sipush", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LDC(18, "ldc", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LDC_W(19, "ldc_w", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LDC2_W(20, "ldc2_w", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ILOAD(21, "iload", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LLOAD(22, "lload", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FLOAD(23, "fload", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DLOAD(24, "dload", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ALOAD(25, "aload", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ILOAD_0(26, "iload_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ILOAD_1(27, "iload_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ILOAD_2(28, "iload_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ILOAD_3(29, "iload_3", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LLOAD_0(30, "lload_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LLOAD_1(31, "lload_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LLOAD_2(32, "lload_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LLOAD_3(33, "lload_3", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FLOAD_0(34, "fload_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FLOAD_1(35, "fload_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FLOAD_2(36, "fload_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FLOAD_3(37, "fload_3", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DLOAD_0(38, "dload_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DLOAD_1(39, "dload_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DLOAD_2(40, "dload_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DLOAD_3(41, "dload_3", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ALOAD_0(42, "aload_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ALOAD_1(43, "aload_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ALOAD_2(44, "aload_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ALOAD_3(45, "aload_3", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    IALOAD(46, "iaload", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    LALOAD(47, "laload", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    FALOAD(48, "faload", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    DALOAD(49, "daload", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    AALOAD(50, "aaload", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    BALOAD(51, "baload", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    CALOAD(52, "caload", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    SALOAD(53, "saload", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    ISTORE(54, "istore", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LSTORE(55, "lstore", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FSTORE(56, "fstore", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DSTORE(57, "dstore", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ASTORE(58, "astore", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ISTORE_0(59, "istore_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ISTORE_1(60, "istore_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ISTORE_2(61, "istore_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ISTORE_3(62, "istore_3", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LSTORE_0(63, "lstore_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LSTORE_1(64, "lstore_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LSTORE_2(65, "lstore_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LSTORE_3(66, "lstore_3", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FSTORE_0(67, "fstore_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FSTORE_1(68, "fstore_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FSTORE_2(69, "fstore_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FSTORE_3(70, "fstore_3", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DSTORE_0(71, "dstore_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DSTORE_1(72, "dstore_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DSTORE_2(73, "dstore_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DSTORE_3(74, "dstore_3", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ASTORE_0(75, "astore_0", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ASTORE_1(76, "astore_1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ASTORE_2(77, "astore_2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ASTORE_3(78, "astore_3", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    IASTORE(79, "iastore", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    LASTORE(80, "lastore", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    FASTORE(81, "fastore", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    DASTORE(82, "dastore", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    AASTORE(83, "aastore", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    BASTORE(84, "bastore", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    CASTORE(85, "castore", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    SASTORE(86, "sastore", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    POP(87, "pop", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    POP2(88, "pop2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP(89, "dup", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP_X1(90, "dup_x1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP_X2(91, "dup_x2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP2(92, "dup2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP2_X1(93, "dup2_x1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP2_X2(94, "dup2_x2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    SWAP(95, "swap", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    IADD(96, "iadd", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LADD(97, "ladd", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FADD(98, "fadd", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DADD(99, "dadd", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    ISUB(100, "isub", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LSUB(101, "lsub", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FSUB(102, "fsub", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DSUB(103, "dsub", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IMUL(104, "imul", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LMUL(105, "lmul", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FMUL(106, "fmul", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DMUL(107, "dmul", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IDIV(108, "idiv", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LDIV(109, "ldiv", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FDIV(110, "fdiv", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DDIV(111, "ddiv", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IREM(112, "irem", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LREM(113, "lrem", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FREM(114, "frem", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DREM(115, "drem", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    INEG(116, "ineg", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LNEG(117, "lneg", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FNEG(118, "fneg", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DNEG(119, "dneg", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    ISHL(120, "ishl", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LSHL(121, "lshl", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    ISHR(122, "ishr", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LSHR(123, "lshr", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IUSHR(124, "iushr", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LUSHR(125, "lushr", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IAND(126, "iand", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LAND(127, "land", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IOR(128, "ior", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LOR(129, "lor", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IXOR(130, "ixor", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LXOR(131, "lxor", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IINC(132, "iinc", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    I2L(133, "i2l", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    I2F(134, "i2f", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    I2D(135, "i2d", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    L2I(136, "l2i", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    L2F(137, "l2f", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    L2D(138, "l2d", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    F2I(139, "f2i", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    F2L(140, "f2l", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    F2D(141, "f2d", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    D2I(142, "d2i", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    D2L(143, "d2l", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    D2F(144, "d2f", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    I2B(145, "i2b", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    I2C(146, "i2c", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    I2S(147, "i2s", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    LCMP(148, "lcmp", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FCMPL(149, "fcmpl", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FCMPG(150, "fcmpg", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DCMPL(151, "dcmpl", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DCMPG(152, "dcmpg", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IFEQ(153, "ifeq", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFNE(154, "ifne", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFLT(155, "iflt", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFGE(156, "ifge", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFGT(157, "ifgt", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFLE(158, "ifle", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPEQ(159, "if_icmpeq", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPNE(160, "if_icmpne", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPLT(161, "if_icmplt", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPGE(162, "if_icmpge", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPGT(163, "if_icmpgt", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPLE(164, "if_icmple", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ACMPEQ(165, "if_acmpeq", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ACMPNE(166, "if_acmpne", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    GOTO(167, "goto", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    JSR(168, "jsr", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    RET(169, "ret", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    TABLESWITCH(170, "tableswitch", OperandTypeEnum.TABLE_SWITCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    LOOKUPSWITCH(171, "lookupswitch", OperandTypeEnum.LOOKUP_SWITCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IRETURN(172, "ireturn", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    LRETURN(173, "lreturn", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    FRETURN(174, "freturn", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    DRETURN(175, "dreturn", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    ARETURN(176, "areturn", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    RETURN(177, "return", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    GETSTATIC(178, "getstatic", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    PUTSTATIC(179, "putstatic", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    GETFIELD(180, "getfield", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    PUTFIELD(181, "putfield", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    INVOKEVIRTUAL(182, "invokevirtual", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    INVOKESPECIAL(183, "invokespecial", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    INVOKESTATIC(184, "invokestatic", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    INVOKEINTERFACE(185, "invokeinterface", OperandTypeEnum.INVOKE_INTERFACE, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    INVOKEDYNAMIC(186, "invokedynamic", OperandTypeEnum.INVOKE_DYNAMIC, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    NEW(187, "new", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    NEWARRAY(188, "newarray", OperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    ANEWARRAY(189, "anewarray", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    ARRAYLENGTH(190, "arraylength", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    ATHROW(191, "athrow", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.THROWING, ""),
    CHECKCAST(192, "checkcast", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    INSTANCEOF(193, "instanceof", OperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    MONITORENTER(194, "monitorenter", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.SYNCHRONIZATION, ""),
    MONITOREXIT(195, "monitorexit", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.SYNCHRONIZATION, ""),
    WIDE(196, "wide", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    MULTIANEWARRAY(197, "multianewarray", OperandTypeEnum.MULTI_A_NEW_ARRAY, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    IFNULL(198, "ifnull", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFNONNULL(199, "ifnonnull", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    GOTO_W(200, "goto_w", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    JSR_W(201, "jsr_w", OperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    BREAKPOINT(202, "breakpoint", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.NO_TYPE, "调试断点操作码"),
    IMPDEP1(254, "impdep1", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.NO_TYPE, "保留操作码"),
    IMPDEP2(255, "impdep2", OperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.NO_TYPE, "保留操作码");

    private final int                 tag;
    private final String              code;
    //操作数类型
    private final OperandTypeEnum     operandType;
    private final InstructionTypeEnum instructionType;
    private final String              desc;

    OpcodeTypeEnum(int tag, String code, OperandTypeEnum operandType,
                   InstructionTypeEnum instructionType, String desc) {
        this.tag = tag;
        this.code = code;
        this.operandType = operandType;
        this.instructionType = instructionType;
        this.desc = desc;
    }

    public static OpcodeTypeEnum getByTag(int tag) {
        for (var value : OpcodeTypeEnum.values()) {
            if (value.tag == tag) {
                return value;
            }
        }
        return null;
    }
}