package com.springboothib._BootHibernateCRUD.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String city;

    public Student() {}

    public Student(String name, String email, String city) {
        this.name = name;
        this.email = email;
        this.city = city;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}

