package com.github.RymarSergey.MyWebApp.model;


import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Resume {
    private String uuid;
    private String fullname;
    private String location;
    private String homePage;
    private List<Contact> contactList=new LinkedList<>();
    private List<Section> sectionList=new LinkedList<>();

    public Resume(String fullname, String location) {
        this(UUID.randomUUID().toString(),fullname,location);
    }

    public Resume(String uuid, String fullname, String location) {
        this.uuid = uuid;
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

    public String getUuid() {
        return uuid;
    }

    public String getFullname() {
        return fullname;
    }

    public String getLocation() {
        return location;
    }

    public String getHomePage() {
        return homePage;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Section> getSectionList() {
        return sectionList;
    }
    public void addSection(Section section){

        sectionList.add(section);
    }
    public void addContact(Contact contact){
        contactList.add(contact);
    }
}
