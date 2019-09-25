/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfirstproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author wondercat
 */
@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String country;

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", country=" + country + '}';
    }

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Person(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Person() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
