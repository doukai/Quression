package io.quression.parser.define.item.impl;

import io.quression.parser.define.item.IItem;

public class NumberItem implements IItem {

    private Float value;

    public NumberItem(Float value) {
        this.value = value;
    }

    public Float getValue() {
        return value;
    }

    public NumberItem setValue(Float value) {
        this.value = value;
        return this;
    }
}
