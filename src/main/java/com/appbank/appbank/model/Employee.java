package com.appbank.appbank.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "EMPLOYEES", schema = "APPBANK")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_employee;
    @Column
        private String name;
    @Column
        private String surname;
    @Column
        private String email;
    @Column
        private String dni;
    @Column
        private String city;
    @Column
        private Date date_hired;
    @Column
        private Integer password;

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDate_hired() {
        return date_hired;
    }

    public void setDate_hired(Date date_hired) {
        this.date_hired = date_hired;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}


