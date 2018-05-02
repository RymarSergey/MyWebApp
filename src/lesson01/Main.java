package lesson01;

import com.github.RymarSergey.MyWebApp.model.Link;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Link l1=new Link("JavaWebinar","javawebinar.ru");
        System.out.println(l1);


    }
}
