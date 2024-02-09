package com.appbank.appbank.model;

import jakarta.persistence.*;

@Entity
@Table(name="CHARACTERISTICS" ,schema = "APPBANK")
public class Characteristic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_characteristic;
    @Column
    private String name;

    public int getId_characteristic() {
        return id_characteristic;
    }

    public void setId_characteristic(int id) {
        this.id_characteristic = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
