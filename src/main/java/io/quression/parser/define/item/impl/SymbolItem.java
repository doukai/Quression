package io.quression.parser.define.item.impl;

import io.quression.parser.define.item.IItem;

public class SymbolItem implements IItem {

    private String name;

    public SymbolItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public SymbolItem setName(String name) {
        this.name = name;
        return this;
    }
}
