package io.quression.parser.define.item.impl;

import io.quression.parser.define.item.IItem;

public class BooleanItem implements IItem {

    private Boolean value;

    public BooleanItem(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public BooleanItem setValue(Boolean value) {
        this.value = value;
        return this;
    }
}
