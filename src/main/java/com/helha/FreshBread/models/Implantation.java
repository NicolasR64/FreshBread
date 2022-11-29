package com.helha.FreshBread.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Implantation {
    // Attribute

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String address;

    // Contructor
    public Implantation(){
        this.name = "";
        this.address = "";
    }
    private Implantation(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
