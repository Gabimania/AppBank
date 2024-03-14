package com.appbank.appbank.model.dto;

import java.util.Date;

public class CustomerDTO {
    private int id_customer;
    private String name;
    private String surname;

    private String phone;
    private String email;
    private  String dni;
    private Date birth_date;
    private Date date_added;

    private String gender;

    private Integer password;

    public CustomerDTO(String name, String dni, Integer password) {
        this.name = name;
        this.dni = dni;
        this.password = password;
    }

    public CustomerDTO() {
    }

    public CustomerDTO(int id_customer, String name, String dni, Integer password) {
        this.id_customer = id_customer;
        this.name = name;
        this.dni = dni;
        this.password = password;
    }

    public CustomerDTO(int id_customer, String name, String surname, String phone, String email, String dni, Date birth_date, Date date_added, String gender, Integer password) {
        this.id_customer = id_customer;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.dni = dni;
        this.birth_date = birth_date;
        this.date_added = date_added;
        this.gender = gender;
        this.password = password;
    }

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
}
