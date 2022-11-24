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
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Attribute
    private int id;
    private String name;
    private float price;
    private int qty;
    private String desc;
    private String picture;

    // Constructor
    public Product(){}
    public Product(String name, float price, int qty, String desc, String picture) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.desc = desc;
        this.picture = picture;
    }
}
