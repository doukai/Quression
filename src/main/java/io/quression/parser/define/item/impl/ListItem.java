package io.quression.parser.define.item.impl;

import io.quression.parser.define.item.IItem;

public class ListItem implements IItem {

    private IItem[] values;

    public ListItem(IItem[] values) {
        this.values = values;
    }

    public IItem[] getValues() {
        return values;
    }

    public ListItem setValues(IItem[] values) {
        this.values = values;
        return this;
    }
}
