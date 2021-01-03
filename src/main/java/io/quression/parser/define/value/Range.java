package io.quression.parser.define.value;

public class Range implements IValue {

    private IValue start;

    private IValue end;

    public Range(IValue start, IValue end) {
        this.start = start;
        this.end = end;
    }

    public IValue getStart() {
        return start;
    }

    public Range setStart(IValue start) {
        this.start = start;
        return this;
    }

    public IValue getEnd() {
        return end;
    }

    public Range setEnd(IValue end) {
        this.end = end;
        return this;
    }
}
