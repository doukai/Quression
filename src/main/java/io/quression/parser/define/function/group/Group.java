package io.quression.parser.define.function.group;

import io.quression.parser.define.field.IField;
import io.quression.parser.define.function.Sub;

public abstract class Group extends Sub {

    private IField field;

    public Group(IField field) {
        this.field = field;
    }

    public IField getField() {
        return field;
    }

    public Group setField(IField field) {
        this.field = field;
        return this;
    }
}
