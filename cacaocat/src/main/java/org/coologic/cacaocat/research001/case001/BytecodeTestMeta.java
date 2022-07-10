package org.coologic.cacaocat.research001.case001;

public class BytecodeTestMeta {
    public int    constant1 =10;
    public String constant2 ="asdf";
    public Double constant3 = 10.10;
    public Long constant4 = Long.MAX_VALUE;

    public static void main(String[] args) {
        BytecodeTestMeta meta = new BytecodeTestMeta();
        meta.postFun();
        meta.fun();
        meta.postFun();
    }

    private void preFun() {

    }

    private void fun() {
        innerInvokeFun();
    }

    private void postFun() {

    }

    private void innerInvokeFun() {

    }
}