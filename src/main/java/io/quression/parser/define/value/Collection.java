package io.quression.parser.define.value;

public class Collection implements IValue {

    private IValue[] values;

    public Collection(IValue[] values) {
        this.values = values;
    }

    public IValue[] getValues() {
        return values;
    }

    public Collection setValues(IValue[] values) {
        this.values = values;
        return this;
    }
}
