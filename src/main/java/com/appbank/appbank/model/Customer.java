package com.appbank.appbank.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
@Entity
@Table(name = "CUSTOMERS",schema = "APPBANK")
public class Customer {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_customer;
    @Column
        private String name;
    @Column
        private String surname;
    @Column
        private String phone;
    @Column
        private String email;
    @Column
        private  String dni;
    @Column
        private Date birth_date;
    @Column
        private Date date_added;
    @Column

        private String gender;
    @Column
    private Integer password;

    @OneToMany
    private List<Operation> operationList;

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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


    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birt_date) {
        this.birth_date = birt_date;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }
}


