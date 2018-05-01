package lesson01;

import com.github.RymarSergey.MyWebApp.model.Link;

public class Main {
    public static void main(String[] args) {
        Link l1=new Link("JavaWebinar","javawebinar.ru");

        Link l2=l1;
        System.out.println(l1.equals(l2));
        Link l3=new Link(l1);
        System.out.println(l1.equals(l3));
        System.out.println(l1);
    }
}
