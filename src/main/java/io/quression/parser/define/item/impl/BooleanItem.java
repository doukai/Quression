package io.quression.parser.define.item.impl;

import io.quression.parser.define.item.IItem;

public class BooleanItem implements IItem {

    private boolean value;

    public BooleanItem(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public BooleanItem setValue(boolean value) {
        this.value = value;
        return this;
    }
}
