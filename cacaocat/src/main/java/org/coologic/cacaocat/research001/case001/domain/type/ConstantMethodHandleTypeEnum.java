package org.coologic.cacaocat.research001.case001.domain.type;

public enum ConstantMethodHandleTypeEnum {
    GET_FIELD(1, "REF_getField"),
    GET_STATIC(2, "REF_getStatic"),
    PUT_FIELD(3, "REF_putField"),
    PUT_STATIC(4, "REF_putStatic"),
    INVOKE_VIRTUAL(5, "REF_invokeVirtual"),
    INVOKE_STATIC(6, "REF_invokeStatic"),
    INVOKE_SPECIAL(7, "REF_invokeSpecial"),
    NEW_INVOKE_SPECIAL(8, "REF_newInvokeSpecial"),
    INVOKE_INTERFACE(9, "REF_invokeInterface"),
    ;

    /**
     * 常量类型tag
     */
    private final int tag;
    /**
     * 常量类型的字节码标准名称
     */
    private final String byteCodeCode;

    ConstantMethodHandleTypeEnum(int tag, String byteCodeCode) {
        this.tag = tag;
        this.byteCodeCode = byteCodeCode;
    }

    public static ConstantMethodHandleTypeEnum getByTag(int tag) {
        for (var value : ConstantMethodHandleTypeEnum.values()) {
            if (value.getTag() == tag) {
                return value;
            }
        }
        return null;
    }

    /**
     * Getter method for property <tt>tag</tt>.
     *
     * @return property value of tag
     */
    public int getTag() {
        return tag;
    }

    /**
     * Getter method for property <tt>byteCodeCode</tt>.
     *
     * @return property value of byteCodeCode
     */
    public String getByteCodeCode() {
        return byteCodeCode;
    }
}