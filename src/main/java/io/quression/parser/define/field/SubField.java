package io.quression.parser.define.field;

public class SubField implements IField {

    private Field belong;

    private String name;

    public SubField(Field belong, String name) {
        this.belong = belong;
        this.name = name;
    }

    public Field getBelong() {
        return belong;
    }

    public SubField setBelong(Field belong) {
        this.belong = belong;
        return this;
    }

    public String getName() {
        return name;
    }

    public SubField setName(String name) {
        this.name = name;
        return this;
    }
}
