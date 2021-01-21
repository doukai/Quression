package io.quression.parser.define.item.impl;

import io.quression.parser.define.item.IItem;

public class AttributeItem implements IItem {

    private String belong;

    private String name;

    public AttributeItem(String belong, String name) {
        this.belong = belong;
        this.name = name;
    }

    public String getBelong() {
        return belong;
    }

    public AttributeItem setBelong(String belong) {
        this.belong = belong;
        return this;
    }

    public String getName() {
        return name;
    }

    public AttributeItem setName(String name) {
        this.name = name;
        return this;
    }
}
