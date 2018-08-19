package com.github.RymarSergey.MyWebApp.storage;/*
 *
 *autor Сергей on 02.05.2018 12:23
 */

import com.github.RymarSergey.MyWebApp.model.Resume;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public class ArrayStorage extends AbstractStorage {
    public static final int LIMIT = 100;
    private Resume[] resumesArray =new Resume[LIMIT];
    private int capacity;
    //private static Logger LOGGER=Logger.getLogger(ArrayStorage.class.getName());//если один логер на класс

    @Override
    public void clear() {
        LOGGER.info("Clear resumes storage ");
        Arrays.fill(resumesArray,null);
       /* for (int index = 0; index <=capacity ; index++) {
            resumesArray[index]=null;
        }*/
        capacity=0;
    }

    @Override
    void doSave(Resume resume) {
        for (int index = 0; index <=capacity ; index++) {
            if ((resumesArray[index]!=null) && (resume.getUuid().equals(resumesArray[index].getUuid()))){
                /*try {
                    throw new WebAppExeption("Resume"+r.getUuid()+"already exist",r);
                } catch (WebAppExeption e) {
                    LOGGER.log(Level.SEVERE,e.getMessage(),e);//
                    return;
                }*/
                //throw new WebAppExeption("Resume "+r.getUuid()+" already exist ",r);
                return;
            }
        }
        resumesArray[capacity++] = resume;
    }

    @Override
    public void update(Resume r) {
        LOGGER.info("Update resume with uuid "+r.getUuid());
        for (int index = 0; index <capacity ; index++) {
            if (r.getUuid().equals(resumesArray[index].getUuid())){
                resumesArray[index]=r;
            } /*else {
                throw new WebAppExeption("Resume with Uuid "+r.getUuid()+" not exist ",r);
            }*/
        }

    }


    @Override
    public Resume load(String uuid) {
        for (int index = 0; index <=capacity ; index++) {
            if ((resumesArray[index]!=null) && (Objects.equals(resumesArray[index].getUuid(), uuid))){
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
        //Todo via comparator
        Arrays.sort(resumesArray,0,capacity);
        return Arrays.asList(Arrays.copyOf(resumesArray,LIMIT));

    }

    @Override
    public int size() {

        return capacity;
    }
    private int getIndex(String uuid){
        if (Optional.ofNullable(uuid).isPresent()) return -2;
        for (int i = 0; i <capacity ; i++) {
            if (resumesArray[i].getUuid().equals(uuid)){
                return i;
            }
        }
        return -1;
    }
}
