package org.coologic.cacaocat.research001.case001;

public class BytecodeTestMeta {
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