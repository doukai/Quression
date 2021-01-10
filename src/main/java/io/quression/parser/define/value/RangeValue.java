package io.quression.parser.define.value;

public class RangeValue implements IValue {

    private IValue value;

    private boolean exclude = false;

    public RangeValue(IValue value) {
        this.value = value;
    }

    public RangeValue(IValue value, boolean exclude) {
        this.value = value;
        this.exclude = exclude;
    }

    public IValue getValue() {
        return value;
    }

    public RangeValue setValue(IValue value) {
        this.value = value;
        return this;
    }

    public boolean isExclude() {
        return exclude;
    }

    public RangeValue setExclude(boolean exclude) {
        this.exclude = exclude;
        return this;
    }
}
