package io.quression.parser.define.function;

import io.quression.parser.define.item.IItem;

public abstract class BaseFunction<T extends IItem> implements IFunction<T> {

    @Override
    public boolean verification(String functionName) {
        return functionName.equals(getName());
    }
}
