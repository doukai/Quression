package io.quression.parser.define.item.impl;

import io.quression.parser.define.item.IItem;

public class StringItem implements IItem {

    private String value;

    public StringItem(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public StringItem setValue(String value) {
        this.value = value;
        return this;
    }
}
