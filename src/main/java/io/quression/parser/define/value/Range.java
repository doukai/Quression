package io.quression.parser.define.value;

public class Range implements IValue {

    private RangeValue min;

    private RangeValue max;

    public Range(RangeValue min, RangeValue max) {
        this.min = min;
        this.max = max;
    }

    public IValue getMin() {
        return min;
    }

    public Range setMin(RangeValue min) {
        this.min = min;
        return this;
    }

    public IValue getMax() {
        return max;
    }

    public Range setMax(RangeValue max) {
        this.max = max;
        return this;
    }
}
