package com.github.RymarSergey.MyWebApp.storage;/*
 *
 *autor Сергей on 27.07.2018 10:12
 */

import com.github.RymarSergey.MyWebApp.model.Resume;

import java.util.logging.Logger;

public abstract class AbstractStorage implements IStorage {
    protected Logger LOGGER=Logger.getLogger(getClass().getName());


    @Override
    public void save(Resume r) {
        LOGGER.info("Save resume with uuid "+r.getUuid());
        //Todo try to move here exception treatment
        doSave(r);
    }
    abstract void doSave(Resume resume);
}
