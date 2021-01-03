package io.quression.parser.define.function;

import io.quression.parser.define.field.IField;
import io.quression.parser.define.value.IValue;

public class Param implements IValue, IField {

    private int index;

    private String name;

    private IValue value;

    public Param(int index, String name, IValue value) {
        this.index = index;
        this.name = name;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public Param setIndex(int index) {
        this.index = index;
        return this;
    }

    public String getName() {
        return name;
    }

    public Param setName(String name) {
        this.name = name;
        return this;
    }

    public IValue getValue() {
        return value;
    }

    public Param setValue(IValue value) {
        this.value = value;
        return this;
    }
}
