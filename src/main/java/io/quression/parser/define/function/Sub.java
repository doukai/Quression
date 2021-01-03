package io.quression.parser.define.function;

import io.quression.parser.define.value.VoidValue;

public abstract class Sub implements IFunction<VoidValue> {

    public abstract void executeSub(Param... params);

    @Override
    public VoidValue execute(Param... params) {
        return new VoidValue();
    }
}
