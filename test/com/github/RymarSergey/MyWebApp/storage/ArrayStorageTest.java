package com.github.RymarSergey.MyWebApp.storage;

import com.github.RymarSergey.MyWebApp.model.Contact;
import com.github.RymarSergey.MyWebApp.model.ContactType;
import com.github.RymarSergey.MyWebApp.model.Resume;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/*
 *
 *autor Сергей on 02.05.2018 15:48
 */
class ArrayStorageTest {
    private static Resume r1,r2,r3;
    private  ArrayStorage arrayStorage=new ArrayStorage();
    static {
        r1 = new Resume("Полное имя1", "адрес1");
        r1.addContact(new Contact(ContactType.MAIL, "mail1@ya.ru"));
        r1.addContact(new Contact(ContactType.MOBILE, "89818239942"));
        r2 = new Resume("Полное имя2", "адрес2");
        r2.addContact(new Contact(ContactType.SKYPE, "skype2"));
        r2.addContact(new Contact(ContactType.HOME_PHONE, "89942"));
        r3 = new Resume("Полное имя3", "адрес3");
        r3.addContact(new Contact(ContactType.MAIL, "mail1@ya.ru"));
        r3.addContact(new Contact(ContactType.MOBILE,"89818239942"));
    }
    @BeforeEach
    void setup(){
        arrayStorage.clear();
        arrayStorage.save(r1);
        arrayStorage.save(r2);
    }
    @Test
    void save() {
        arrayStorage.save(r3);
        Assert.assertEquals(3,arrayStorage.size());
        arrayStorage.save(r3);
        Assert.assertEquals(3,arrayStorage.size());
    }
    @Test
    void clear() {
        arrayStorage.clear();
        Assert.assertEquals(0,arrayStorage.size());
    }

    @Test
    void update() {
    }

    @Test
    void load() {
    }

    @Test
    void delete() {
        arrayStorage.delete(r1.getUuid());
        Assert.assertEquals(1,arrayStorage.size());
        Assert.assertEquals(null,arrayStorage.load(r1.getUuid()));
    }

    @Test
    void getAllSorted() {
    }

    @Test
    void size() {
        Assert.assertEquals(2,arrayStorage.size());
    }
}