package com.springboot._SpringBoot_jdbc.entity;

public class Student {
    private int id;
    private String name;
    private String branch;
    private String address;

    public Student() {
    }

    public Student(int id, String name, String branch, String address) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.address = address;
    }

    // --- Getters and Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
