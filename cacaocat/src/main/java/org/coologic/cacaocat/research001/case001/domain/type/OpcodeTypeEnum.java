package org.coologic.cacaocat.research001.case001.domain.type;

import lombok.Getter;

//操作码类型
@Getter
public enum OpcodeTypeEnum {
    NOP(0, "nop", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.NO_TYPE, "空操作"),
    ACONST_NULL(1, "aconst_null", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_M1(2, "iconst_m1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_0(3, "iconst_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_1(4, "iconst_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_2(5, "iconst_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_3(6, "iconst_3", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_4(7, "iconst_4", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ICONST_5(8, "iconst_5", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LCONST_0(9, "lconst_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LCONST_1(10, "lconst_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FCONST_0(11, "fconst_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FCONST_1(12, "fconst_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FCONST_2(13, "fconst_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DCONST_0(14, "dconst_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DCONST_1(15, "dconst_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    BIPUSH(16, "bipush", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    SIPUSH(17, "sipush", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LDC(18, "ldc", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LDC_W(19, "ldc_w", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LDC2_W(20, "ldc2_w", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ILOAD(21, "iload", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LLOAD(22, "lload", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FLOAD(23, "fload", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DLOAD(24, "dload", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ALOAD(25, "aload", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ILOAD_0(26, "iload_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ILOAD_1(27, "iload_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ILOAD_2(28, "iload_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ILOAD_3(29, "iload_3", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LLOAD_0(30, "lload_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LLOAD_1(31, "lload_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LLOAD_2(32, "lload_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LLOAD_3(33, "lload_3", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FLOAD_0(34, "fload_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FLOAD_1(35, "fload_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FLOAD_2(36, "fload_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FLOAD_3(37, "fload_3", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DLOAD_0(38, "dload_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DLOAD_1(39, "dload_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DLOAD_2(40, "dload_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DLOAD_3(41, "dload_3", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ALOAD_0(42, "aload_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ALOAD_1(43, "aload_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ALOAD_2(44, "aload_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ALOAD_3(45, "aload_3", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    IALOAD(46, "iaload", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    LALOAD(47, "laload", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    FALOAD(48, "faload", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    DALOAD(49, "daload", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    AALOAD(50, "aaload", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    BALOAD(51, "baload", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    CALOAD(52, "caload", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    SALOAD(53, "saload", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    ISTORE(54, "istore", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LSTORE(55, "lstore", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FSTORE(56, "fstore", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DSTORE(57, "dstore", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ASTORE(58, "astore", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ISTORE_0(59, "istore_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ISTORE_1(60, "istore_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ISTORE_2(61, "istore_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ISTORE_3(62, "istore_3", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LSTORE_0(63, "lstore_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LSTORE_1(64, "lstore_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LSTORE_2(65, "lstore_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    LSTORE_3(66, "lstore_3", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FSTORE_0(67, "fstore_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FSTORE_1(68, "fstore_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FSTORE_2(69, "fstore_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    FSTORE_3(70, "fstore_3", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DSTORE_0(71, "dstore_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DSTORE_1(72, "dstore_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DSTORE_2(73, "dstore_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    DSTORE_3(74, "dstore_3", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ASTORE_0(75, "astore_0", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ASTORE_1(76, "astore_1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ASTORE_2(77, "astore_2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    ASTORE_3(78, "astore_3", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    IASTORE(79, "iastore", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    LASTORE(80, "lastore", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    FASTORE(81, "fastore", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    DASTORE(82, "dastore", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    AASTORE(83, "aastore", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    BASTORE(84, "bastore", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    CASTORE(85, "castore", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    SASTORE(86, "sastore", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    POP(87, "pop", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    POP2(88, "pop2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP(89, "dup", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP_X1(90, "dup_x1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP_X2(91, "dup_x2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP2(92, "dup2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP2_X1(93, "dup2_x1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    DUP2_X2(94, "dup2_x2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    SWAP(95, "swap", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OPERAND_STACK_MANAGEMENT, ""),
    IADD(96, "iadd", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LADD(97, "ladd", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FADD(98, "fadd", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DADD(99, "dadd", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    ISUB(100, "isub", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LSUB(101, "lsub", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FSUB(102, "fsub", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DSUB(103, "dsub", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IMUL(104, "imul", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LMUL(105, "lmul", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FMUL(106, "fmul", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DMUL(107, "dmul", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IDIV(108, "idiv", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LDIV(109, "ldiv", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FDIV(110, "fdiv", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DDIV(111, "ddiv", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IREM(112, "irem", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LREM(113, "lrem", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FREM(114, "frem", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DREM(115, "drem", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    INEG(116, "ineg", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LNEG(117, "lneg", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FNEG(118, "fneg", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DNEG(119, "dneg", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    ISHL(120, "ishl", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LSHL(121, "lshl", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    ISHR(122, "ishr", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LSHR(123, "lshr", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IUSHR(124, "iushr", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LUSHR(125, "lushr", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IAND(126, "iand", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LAND(127, "land", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IOR(128, "ior", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LOR(129, "lor", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IXOR(130, "ixor", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    LXOR(131, "lxor", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IINC(132, "iinc", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    I2L(133, "i2l", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    I2F(134, "i2f", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    I2D(135, "i2d", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    L2I(136, "l2i", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    L2F(137, "l2f", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    L2D(138, "l2d", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    F2I(139, "f2i", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    F2L(140, "f2l", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    F2D(141, "f2d", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    D2I(142, "d2i", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    D2L(143, "d2l", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    D2F(144, "d2f", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    I2B(145, "i2b", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    I2C(146, "i2c", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    I2S(147, "i2s", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.TYPE_CONVERSION, ""),
    LCMP(148, "lcmp", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FCMPL(149, "fcmpl", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    FCMPG(150, "fcmpg", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DCMPL(151, "dcmpl", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    DCMPG(152, "dcmpg", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.ARITHMETIC, ""),
    IFEQ(153, "ifeq", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFNE(154, "ifne", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFLT(155, "iflt", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFGE(156, "ifge", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFGT(157, "ifgt", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFLE(158, "ifle", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPEQ(159, "if_icmpeq", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPNE(160, "if_icmpne", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPLT(161, "if_icmplt", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPGE(162, "if_icmpge", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPGT(163, "if_icmpgt", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ICMPLE(164, "if_icmple", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ACMPEQ(165, "if_acmpeq", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IF_ACMPNE(166, "if_acmpne", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    GOTO(167, "goto", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    JSR(168, "jsr", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    RET(169, "ret", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    TABLESWITCH(170, "tableswitch", OpcodeOperandTypeEnum.TABLE_SWITCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    LOOKUPSWITCH(171, "lookupswitch", OpcodeOperandTypeEnum.LOOKUP_SWITCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IRETURN(172, "ireturn", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    LRETURN(173, "lreturn", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    FRETURN(174, "freturn", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    DRETURN(175, "dreturn", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    ARETURN(176, "areturn", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    RETURN(177, "return", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    GETSTATIC(178, "getstatic", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    PUTSTATIC(179, "putstatic", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    GETFIELD(180, "getfield", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    PUTFIELD(181, "putfield", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    INVOKEVIRTUAL(182, "invokevirtual", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    INVOKESPECIAL(183, "invokespecial", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    INVOKESTATIC(184, "invokestatic", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    INVOKEINTERFACE(185, "invokeinterface", OpcodeOperandTypeEnum.INVOKE_INTERFACE, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    INVOKEDYNAMIC(186, "invokedynamic", OpcodeOperandTypeEnum.INVOKE_DYNAMIC, InstructionTypeEnum.METHOD_INVOCATION_AND_RETURN, ""),
    NEW(187, "new", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    NEWARRAY(188, "newarray", OpcodeOperandTypeEnum.BYTE_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    ANEWARRAY(189, "anewarray", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    ARRAYLENGTH(190, "arraylength", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    ATHROW(191, "athrow", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.THROWING, ""),
    CHECKCAST(192, "checkcast", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    INSTANCEOF(193, "instanceof", OpcodeOperandTypeEnum.SHORT_OPERAND, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    MONITORENTER(194, "monitorenter", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.SYNCHRONIZATION, ""),
    MONITOREXIT(195, "monitorexit", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.SYNCHRONIZATION, ""),
    WIDE(196, "wide", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.LOAD_AND_STORE, ""),
    MULTIANEWARRAY(197, "multianewarray", OpcodeOperandTypeEnum.MULTI_A_NEW_ARRAY, InstructionTypeEnum.OBJECT_CREATION_AND_MANIPULATION, ""),
    IFNULL(198, "ifnull", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    IFNONNULL(199, "ifnonnull", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    GOTO_W(200, "goto_w", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    JSR_W(201, "jsr_w", OpcodeOperandTypeEnum.BRANCH, InstructionTypeEnum.CONTROL_TRANSFER, ""),
    BREAKPOINT(202, "breakpoint", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.NO_TYPE, "调试断点操作码"),
    IMPDEP1(254, "impdep1", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.NO_TYPE, "保留操作码"),
    IMPDEP2(255, "impdep2", OpcodeOperandTypeEnum.ZERO_OPERAND, InstructionTypeEnum.NO_TYPE, "保留操作码");

    private final int                   tag;
    private final String                code;
    //操作数类型
    private final OpcodeOperandTypeEnum operandType;
    private final InstructionTypeEnum   instructionType;
    private final String                desc;

    OpcodeTypeEnum(int tag, String code, OpcodeOperandTypeEnum operandType,
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