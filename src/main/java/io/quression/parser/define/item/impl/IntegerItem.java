package io.quression.parser.define.item.impl;

import io.quression.parser.define.item.IItem;

public class IntegerItem implements IItem {

    private Integer value;

    public IntegerItem(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public IntegerItem setValue(Integer value) {
        this.value = value;
        return this;
    }
}
