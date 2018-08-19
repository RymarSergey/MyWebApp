package com.github.RymarSergey.MyWebApp.storage;

import com.github.RymarSergey.MyWebApp.model.Contact;
import com.github.RymarSergey.MyWebApp.model.ContactType;
import com.github.RymarSergey.MyWebApp.model.Resume;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


/*
 *
 *autor Сергей on 02.05.2018 15:48
 */
class ArrayStorageTest {
    private  Resume r1,r2,r3;
    private  ArrayStorage arrayStorage=new ArrayStorage();
    @BeforeEach
    void setup(){
        arrayStorage.clear();
        r1 = new Resume("Полное имя1", "адрес1");
        r1.addContact(new Contact(ContactType.MAIL, "mail1@ya.ru"));
        r1.addContact(new Contact(ContactType.MOBILE, "89818239942"));
        r2 = new Resume("Полное имя2", "адрес2");
        r2.addContact(new Contact(ContactType.SKYPE, "skype2"));
        r2.addContact(new Contact(ContactType.HOME_PHONE, "89942"));
        r3 = new Resume("Полное имя3", "адрес3");
        r3.addContact(new Contact(ContactType.MAIL, "mail1@ya.ru"));
        r3.addContact(new Contact(ContactType.MOBILE,"89818239942"));
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

    @Test/*(expected=WebAppExeption.class)*///в junit 5 не работает
    void update(){
        r2.setFullname("updated name in r2 resume");
        arrayStorage.update(r2);
        Assert.assertEquals(r2,arrayStorage.load(r2.getUuid()));

    }
      /* arrayStorage.load(r1.getUuid()).
    getContactList().stream().filter((c)->c.getValue().
    equals(str)).findFirst().get().getValue().toCharArray().equals(str.toCharArray()));*/
    @Test
    void load() {
        Assert.assertEquals(r1,arrayStorage.load(r1.getUuid()));
        Assert.assertEquals(r2,arrayStorage.load(r2.getUuid()));

    }

    @Test
    void delete() {
        arrayStorage.delete(r1.getUuid());
        Assert.assertEquals(1,arrayStorage.size());
        Assert.assertEquals(null,arrayStorage.load(r1.getUuid()));
    }

    @Test
    void getAllSorted() {
    Resume[] testarray=new Resume[100];
    testarray[0]=r3;
    testarray[1]=r1;
    testarray[2]=r2;
    Arrays.sort(testarray);
    assertArrayEquals(testarray,arrayStorage.getAllSorted().toArray());
    }

    @Test
    void size() {
        Assert.assertEquals(2,arrayStorage.size());
    }
}