package com.github.RymarSergey.MyWebApp.storage;/*
 *
 *autor Сергей on 02.05.2018 12:23
 */

import com.github.RymarSergey.MyWebApp.model.Resume;

import java.util.Collection;

public class ArrayStorage implements IStorage {
    private Resume[] resumesArray =new Resume[100];
    @Override
    public void clear() {

    }

    @Override
    public void save(Resume r) {

    }

    @Override
    public void update(Resume r) {

    }

    @Override
    public Resume load(String uuid) {
        return null;
    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Collection<Resume> getAllSorted() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
