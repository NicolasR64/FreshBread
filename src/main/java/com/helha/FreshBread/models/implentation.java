package com.helha.FreshBread.models;

public class implentation {
    // Attribute

    private String name;
    private String address;

    // Contructor

    public implentation(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter and Setter

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
