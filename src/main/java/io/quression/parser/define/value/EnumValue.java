package io.quression.parser.define.value;

public class EnumValue implements IValue {

    private String enumName;

    private String enumItem;

    public EnumValue(String enumName, String enumItem) {
        this.enumName = enumName;
        this.enumItem = enumItem;
    }

    public String getEnumName() {
        return enumName;
    }

    public EnumValue setEnumName(String enumName) {
        this.enumName = enumName;
        return this;
    }

    public String getEnumItem() {
        return enumItem;
    }

    public EnumValue setEnumItem(String enumItem) {
        this.enumItem = enumItem;
        return this;
    }
}
