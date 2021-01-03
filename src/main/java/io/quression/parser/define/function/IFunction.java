package io.quression.parser.define.function;

import io.quression.parser.define.value.IValue;

public interface IFunction<T extends IValue> extends IValue {

    T execute(Param... params);
}
