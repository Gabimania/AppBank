package com.appbank.appbank.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCTS", schema = "APPBANK")
public class Product {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id_product;
 @Column
    private String name;

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id) {
        this.id_product = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
