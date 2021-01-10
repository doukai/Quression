package io.quression.parser.define.value;

public class IntegerValue {

    private Integer value;

    public IntegerValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public IntegerValue setValue(Integer value) {
        this.value = value;
        return this;
    }
}
