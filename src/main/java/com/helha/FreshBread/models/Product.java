package com.helha.FreshBread.models;

public class Product {

    // Attribute
    private int id;
    private String name;
    private float price;
    private int qty;
    private String description;
    private String image;

    // Constructor

    public Product(String name, float prix, int qty, String description, String image) {
        this.name = name;
        this.price = prix;
        this.qty = qty;
        this.description = description;
        this.image = image;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
