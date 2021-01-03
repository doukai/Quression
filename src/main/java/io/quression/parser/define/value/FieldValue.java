package io.quression.parser.define.value;

import io.quression.parser.define.field.Field;

public class FieldValue implements IValue {

    private Field field;

    public FieldValue(Field field) {
        this.field = field;
    }

    public Field getField() {
        return field;
    }

    public FieldValue setField(Field field) {
        this.field = field;
        return this;
    }
}
