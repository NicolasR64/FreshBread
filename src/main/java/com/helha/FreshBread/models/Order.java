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
    @JoinColumn(name = "implantation_id")
    private Implantation implantation;
    private String products;
    private String state;

    private int userId;

    // Contructor

    public Order(){}

    public Order(LocalDateTime date, Implantation implantation, String products, String state, int userId) {
        this.date = LocalDateTime.now();
        this.implantation = implantation;
        this.products = products;
        this.state = state;
        this.userId = userId;
    }

}
