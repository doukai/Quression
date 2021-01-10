package io.quression.parser.define.value;

public class BooleanValue implements IValue {

    private boolean value;

    public BooleanValue(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    public BooleanValue setValue(boolean value) {
        this.value = value;
        return this;
    }
}
