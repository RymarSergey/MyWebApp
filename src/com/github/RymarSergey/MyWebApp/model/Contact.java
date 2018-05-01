package com.github.RymarSergey.MyWebApp.model;
/*
 *
 *autor Сергей on 01.05.2018 16:33
 */

public class Contact {
    private final String type;
    private final String value;

    public Contact(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
