package com.github.RymarSergey.MyWebApp.model;/*
 *
 *autor Сергей on 01.05.2018 19:09
 */

public enum ContactType {
    HOME_PHONE("Домашний телефон "),
    MOBILE("Мобильный телефон "),
    SKYPE("Скайп "),
    MAIL("Почта ");

    private String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
