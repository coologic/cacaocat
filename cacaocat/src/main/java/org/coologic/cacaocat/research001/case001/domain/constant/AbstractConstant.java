package org.coologic.cacaocat.research001.case001.domain.constant;

import java.io.DataInput;
import java.io.IOException;

public abstract class AbstractConstant implements Constant {
    protected int currentIndex;

    @Override
    public final void parse(DataInput input, int currentIndex) throws IOException {
        this.currentIndex = currentIndex;
        parseData(input);
    }

    abstract public void parseData(DataInput input) throws IOException;

    @Override
    public int getCurrentIndex() {
        return currentIndex;
    }
}