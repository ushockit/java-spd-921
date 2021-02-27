package org.itstep.enums;

public enum Color {
    RED("#f00"),
    GREEN("#0f0"),
    BLUE("#00f");

    private String value;

    Color(String color) {
        value = color;
    }

    public String getValue() {
        return value;
    }
}
