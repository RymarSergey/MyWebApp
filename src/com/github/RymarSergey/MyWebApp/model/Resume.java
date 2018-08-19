package com.github.RymarSergey.MyWebApp.model;


import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Resume implements Comparable<Resume>{
    private String uuid;
    private String fullname;
    private String location;
    private String homePage;
    private List<Contact> contactList=new LinkedList<>();
    private List<Section> sectionList=new LinkedList<>();

    public Resume(Resume resume){

    }
    public Resume(String fullname, String location) {
        this(UUID.randomUUID().toString(),fullname,location);
    }

    public Resume(String uuid, String fullname, String location) {
        this.uuid = uuid;
        this.fullname = fullname;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "uuid='" + uuid + '\'' +
                ", fullname='" + fullname + '\'' +
                ", location='" + location + '\'' +
                ", homePage='" + homePage + '\'' +
                ", contactList=" + contactList +
                ", sectionList=" + sectionList +
                '}';
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public void setSectionList(List<Section> sectionList) {
        this.sectionList = sectionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return Objects.equals(uuid, resume.uuid) &&
                Objects.equals(fullname, resume.fullname) &&
                Objects.equals(location, resume.location) &&
                Objects.equals(homePage, resume.homePage) &&
                Objects.equals(contactList, resume.contactList) &&
                Objects.equals(sectionList, resume.sectionList);
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


    @Override
    public int compareTo(Resume o) {
        return fullname.compareTo(o.fullname);
    }
}
