package com.github.RymarSergey.MyWebApp.storage;/*
 *
 *autor Сергей on 02.05.2018 12:23
 */

import com.github.RymarSergey.MyWebApp.model.Resume;

import java.util.Collection;

public class ArrayStorage implements IStorage {
    public static final int LIMIT = 100;
    private Resume[] resumesArray =new Resume[LIMIT];
    private int capacity;
    @Override
    public void clear() {
        for (int index = 0; index <=capacity ; index++) {
            resumesArray[index]=null;
        }
        capacity=0;
    }

    @Override
    public void save(Resume r) {
        for (int index = 0; index <=capacity ; index++) {
            if ((resumesArray[index]!=null) && (r.equals(resumesArray[index]))){
                return;
            }
        }
        resumesArray[capacity]=r;
        capacity++;
    }

    @Override
    public void update(Resume r) {

    }

    @Override
    public Resume load(String uuid) {
        for (int index = 0; index <=capacity ; index++) {
            if ((resumesArray[index]!=null) && (resumesArray[index].getUuid()==uuid)){
                return resumesArray[index];
            }
        }
        return null;
    }

    @Override
    public void delete(String uuid) {
        for (int index = 0; index <=capacity ; index++) {
            if (resumesArray[index].getUuid().equals(uuid)){
               System.arraycopy(resumesArray,index+1,resumesArray,index,capacity-index);
               capacity--;
               return;
            }
        }

    }

    @Override
    public Collection<Resume> getAllSorted() {

        return null;
    }

    @Override
    public int size() {

        return capacity;
    }
}
