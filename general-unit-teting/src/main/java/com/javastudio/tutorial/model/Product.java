package com.javastudio.tutorial.model;

import java.time.LocalDate;
import java.util.Date;

public class Product {

    private String name;

    private LocalDate expiryDate;

    public Product() {
    }

    public Product(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
