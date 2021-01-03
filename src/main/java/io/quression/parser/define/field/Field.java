package io.quression.parser.define.field;

public class Field implements IField {

    private String name;

    public Field(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Field setName(String name) {
        this.name = name;
        return this;
    }
}
