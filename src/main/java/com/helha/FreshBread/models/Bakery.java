package com.helha.FreshBread.models;

public class Bakery {
    // Attribute

    private int id;
    private String name;
    private String address;

    private int userId;

    // Contructor

    public Bakery(String name, String address, int userId) {
        this.name = name;
        this.address = address;
        this.userId = userId;
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

    public int getUserId() {
        return userId;
    }

}

