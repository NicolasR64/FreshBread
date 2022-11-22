package com.helha.FreshBread.models;


import java.time.LocalDateTime;

public class Order {
    // Attribute

    private int id;
    private LocalDateTime date;
    private Implantation implantation;
    private String products;
    private String state;

    // Contructor

    public Order(LocalDateTime date, Implantation implantation, String products, String state) {
        this.date = LocalDateTime.now();
        this.implantation = implantation;
        this.products = products;
        this.state = state;
    }


    // Getters and Setters

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Implantation getImplentation() {
        return implantation;
    }

    public void setImplentation(Implantation implantationntation) {
        this.implantation = implantation;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
