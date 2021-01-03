package io.quression.parser.define.variable;

import io.quression.parser.define.value.IValue;

public class ValueVariable implements IValue, IVariable {

    private String name;

    public ValueVariable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ValueVariable setName(String name) {
        this.name = name;
        return this;
    }
}
