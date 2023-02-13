package com.example.Student_Library.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id   // Primary key here
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this will give autogeneration of values
    private int id ;

    private String name ;

    @Column(unique = true)
    private  String email ;

    private  String mobNo ;

    private int age ;

    private String country ;

    // plain syntax of bidirectional mapping
    @OneToOne(mappedBy = "studentVariableName",cascade = CascadeType.ALL)
    private  Card card ; // set this entity

    public Student() {
    }
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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
