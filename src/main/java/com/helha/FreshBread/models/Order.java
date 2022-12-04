package com.helha.FreshBread.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Order {
    // Attribute
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDateTime date;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    private String products;
    private String state;

    private int userId;

    // Contructor

    public Order(){}

    public Order(LocalDateTime date, Location location, String products, String state, int userId) {
        this.date = LocalDateTime.now();
        this.location = location;
        this.products = products;
        this.state = state;
        this.userId = userId;
    }

}
