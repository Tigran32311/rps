package com.example.demo12.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String address;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
