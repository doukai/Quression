package io.quression.parser.define.function.order;

import io.quression.parser.define.field.IField;
import io.quression.parser.define.function.Sub;

public abstract class Order extends Sub {

    private IField field;

    private Sort sort;

    public Order(IField field, Sort sort) {
        this.field = field;
        this.sort = sort;
    }

    public IField getField() {
        return field;
    }

    public Order setField(IField field) {
        this.field = field;
        return this;
    }

    public Sort getSort() {
        return sort;
    }

    public Order setSort(Sort sort) {
        this.sort = sort;
        return this;
    }
}
