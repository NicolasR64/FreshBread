package com.helha.FreshBread.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Bakery {
    // Attribute

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;

    private int userId;

    // Contructor

    public Bakery(){}

    public Bakery(String name, String address, int userId) {
        this.name = name;
        this.address = address;
        this.userId = userId;
    }

}

