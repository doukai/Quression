package io.quression.parser.define.value;

public class StringValue implements IValue {

    private String value;

    public StringValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public StringValue setValue(String value) {
        this.value = value;
        return this;
    }
}
