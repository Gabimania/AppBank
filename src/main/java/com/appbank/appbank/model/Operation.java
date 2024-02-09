package com.appbank.appbank.model;

import jakarta.persistence.*;

@Entity
@Table(name= "OPERATIONS", schema = "APPBANK")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_operation;
    @Column
    private String name;

    public int getId() {
        return id_operation;
    }

    public void setId(int id) {
        this.id_operation = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
