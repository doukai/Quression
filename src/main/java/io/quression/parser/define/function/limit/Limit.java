package io.quression.parser.define.function.limit;

import io.quression.parser.define.function.Sub;

public abstract class Limit extends Sub {

    private int total;
    private int size;

    public Limit(int total, int size) {
        this.total = total;
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public Limit setTotal(int total) {
        this.total = total;
        return this;
    }

    public int getSize() {
        return size;
    }

    public Limit setSize(int size) {
        this.size = size;
        return this;
    }
}
