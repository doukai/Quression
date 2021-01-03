package io.quression.parser.define.variable;

import io.quression.parser.define.field.IField;

public class FieldVariable implements IField, IVariable {

    private String name;

    public FieldVariable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public FieldVariable setName(String name) {
        this.name = name;
        return this;
    }
}
