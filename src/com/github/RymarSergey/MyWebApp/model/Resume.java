package com.github.RymarSergey.MyWebApp.model;


import java.util.List;
import java.util.Objects;

public class Resume {
    private String uuid;
    private String fullname;
    private String location;
    private String homePage;
    private List<Contact> contactList;
    private List<Section> sectionList;

    public Resume(String fullname, String location) {
        this.fullname = fullname;
        this.location = location;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return Objects.equals(uuid, resume.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
