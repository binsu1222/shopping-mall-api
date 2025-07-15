package com.example.demo.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private int id;
    private String name;
    private int price;
    private String description;

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
