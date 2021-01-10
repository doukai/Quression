package io.quression.parser.define.value;

public class TypeValue implements IValue {

    private String typeName;

    private IValue[] item;

    public TypeValue(String typeName, IValue... item) {
        this.item = item;
    }

    public String getTypeName() {
        return typeName;
    }

    public TypeValue setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public IValue[] getItem() {
        return item;
    }

    public TypeValue setItem(IValue[] item) {
        this.item = item;
        return this;
    }
}
