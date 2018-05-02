package com.github.RymarSergey.MyWebApp.storage;/*
 *
 *autor Сергей on 02.05.2018 12:06
 */

import com.github.RymarSergey.MyWebApp.model.Resume;

import java.util.Collection;

public interface IStorage {
    void clear();

    void save(Resume r);

    void update(Resume r);

    Resume load(String uuid);

    void delete(String uuid);

    Collection<Resume> getAllSorted();

    int size();

}
