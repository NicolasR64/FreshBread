package com.helha.FreshBread.models;


import java.time.LocalDateTime;

public class Order {
    // Attribute

    private int id;
    private LocalDateTime date;
    private Implentation implentation;
    private String products;
    private String state;

    // Contructor

    public Order(LocalDateTime date, Implentation implentation, String products, String state) {
        this.date = LocalDateTime.now();
        this.implentation = implentation;
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

    public Implentation getImplentation() {
        return implentation;
    }

    public void setImplentation(Implentation implentation) {
        this.implentation = implentation;
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
