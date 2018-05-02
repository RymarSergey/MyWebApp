package lesson03;/*
 *
 *autor Сергей on 02.05.2018 9:08
 */

import com.github.RymarSergey.MyWebApp.model.Link;

import java.lang.reflect.Field;

public class Lesson3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //достаем поле из класса!!!!3 лекция рефлекшен
        Field f=Link.class.getDeclaredField("url");
        f.setAccessible(true);

        Link l=new Link("fghthd","URL");
        System.out.println(f.get(l));
    }
}
