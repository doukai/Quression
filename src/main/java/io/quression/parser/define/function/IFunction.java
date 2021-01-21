package io.quression.parser.define.function;

import io.quression.parser.define.item.IItem;

public interface IFunction<T extends IItem> extends IItem {

    String getName();

    boolean verification(String functionName);

    T execute(IItem... items);
}
