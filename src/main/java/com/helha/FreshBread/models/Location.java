package com.helha.FreshBread.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Location {
    // Attribute

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String address;

    // Contructor
    public Location(){
        this.name = "";
        this.address = "";
    }
    private Location(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
