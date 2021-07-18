package com.example.demo.pojo;

public class Student {
    private String fName;
    private String lname;
    private String[] grades;
    private String[] subjects;
    private Address address;

    public Student(String fName, String lname, String[] grades, String[] subjects, Address address) {
        this.fName = fName;
        this.lname = lname;
        this.grades = grades;
        this.subjects = subjects;
        this.address = address;
    }

    public Student() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String[] getGrades() {
        return grades;
    }

    public void setGrades(String[] grades) {
        this.grades = grades;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
