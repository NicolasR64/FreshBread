package com.helha.FreshBread.models;

public class bakery {
    // Attribute

    private int id;
    private String name;
    private String address;

    // Contructor

    public bakery(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

