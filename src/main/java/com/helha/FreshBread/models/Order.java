package com.helha.FreshBread.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Order {
    // Attribute

    private int id;
    private LocalDateTime date;
    private Implantation implantation;
    private String products;
    private String state;

    private int userId;

    // Contructor

    public Order(LocalDateTime date, Implantation implantation, String products, String state, int userId) {
        this.date = LocalDateTime.now();
        this.implantation = implantation;
        this.products = products;
        this.state = state;
        this.userId = userId;
    }

}
