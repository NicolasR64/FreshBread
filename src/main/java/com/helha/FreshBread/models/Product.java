package com.helha.FreshBread.models;

public class Product {

    // Attribute
    private int id;
    private String name;
    private float price;
    private int qty;
    private String desc;
    private String picture;

    // Constructor

    public Product(String name, float prix, int qty, String desc, String picture) {
        this.name = name;
        this.price = prix;
        this.qty = qty;
        this.desc = desc;
        this.picture = picture;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return picture;
    }

    public void setImage(String image) {
        this.picture = picture;
    }
}
