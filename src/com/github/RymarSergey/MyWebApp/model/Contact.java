package com.github.RymarSergey.MyWebApp.model;
/*
 *
 *autor Сергей on 01.05.2018 16:33
 */

public class Contact {
    private final ContactType type;
    private final String value;

    public Contact(ContactType type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "type=" + type +
                ", value='" + value + '\'' +
                '}';
    }

    public ContactType getType() {
        return type;
    }
}
