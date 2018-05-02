package com.github.RymarSergey.MyWebApp.storage;

import com.github.RymarSergey.MyWebApp.model.Contact;
import com.github.RymarSergey.MyWebApp.model.ContactType;
import com.github.RymarSergey.MyWebApp.model.Resume;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/*
 *
 *autor Сергей on 02.05.2018 15:48
 */
class ArrayStorageTest {
    private static Resume r1,r2,r3;
    private  ArrayStorage arrayStorage=new ArrayStorage();
    static {
       r1=new Resume("Полное имя1","адрес1");
       r1.addContact(new Contact(ContactType.MAIL,"mail1@ya.ru"));
       r1.addContact(new Contact(ContactType.MOBILE,"89818239942"));
        r2=new Resume("Полное имя2","адрес2");
        r2.addContact(new Contact(ContactType.SKYPE,"skype2"));
        r2.addContact(new Contact(ContactType.HOME_PHONE,"89942"));
        r3=new Resume("Полное имя3","адрес3");
        r1.addContact(new Contact(ContactType.MAIL,"mail1@ya.ru"));
        r1.addContact(new Contact(ContactType.MOBILE,"89818239942"));
    }
    @Before
    void befor(){
        arrayStorage.clear();
        arrayStorage.save(r1);
        arrayStorage.save(r2);
        arrayStorage.save(r3);
    }
    @Test
    void save() {
    }
    @Test
    void clear() {
    }

    @Test
    void update() {
    }

    @Test
    void load() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAllSorted() {
    }

    @Test
    void size() {

    }
}