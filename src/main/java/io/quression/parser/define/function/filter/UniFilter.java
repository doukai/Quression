package io.quression.parser.define.function.filter;

import io.quression.parser.define.field.IField;
import io.quression.parser.define.function.Sub;
import io.quression.parser.define.value.IValue;

public abstract class UniFilter extends Sub implements IFilter {

    private Contact contact;

    private IField field;

    private Operate operate;

    private IValue value;

    public UniFilter(Contact contact, IField field, Operate operate, IValue value) {
        this.contact = contact;
        this.field = field;
        this.operate = operate;
        this.value = value;
    }

    public Contact getContact() {
        return contact;
    }

    public UniFilter setContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public IField getField() {
        return field;
    }

    public UniFilter setField(IField field) {
        this.field = field;
        return this;
    }

    public Operate getOperate() {
        return operate;
    }

    public UniFilter setOperate(Operate operate) {
        this.operate = operate;
        return this;
    }

    public IValue getValue() {
        return value;
    }

    public UniFilter setValue(IValue value) {
        this.value = value;
        return this;
    }
}
