package com.github.RymarSergey.MyWebApp.model;
/*
 *
 *autor Сергей on 01.05.2018 13:22
 */

import java.util.Objects;

public class Link {
    private static Link EMPTY=new Link();
    private String name;
    private String url;
    public Link(){
        this("","");//вызов своего же конструктора с другой сигнатурой
    }

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }
    public Link(Link link){
        this(link.name,link.url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return Objects.equals(name, link.name) &&
                Objects.equals(url, link.url);
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, url);
    }
    public static Link empty(){
        return EMPTY;
    }
}
