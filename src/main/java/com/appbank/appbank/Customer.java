package com.appbank.appbank;

import java.util.Scanner;
import java.util.concurrent.CompletionService;

public class Customer {
   private String name;
    private String surname;

   private String phone;
    private String email;
   private  String dni;
    private String city;
   private  String birth_date;
    private String date_added;

    private String gender;

    private int password;

    public Customer(String name, String surname, String phone, String email, String dni, String city, String birt_date, String date_added, String gender, int password) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.dni = dni;
        this.city = city;
        this.birth_date = birt_date;
        this.date_added = date_added;
        this.gender = gender;
        this.password = password;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBirt_date() {
        return birth_date;
    }

    public void setBirt_date(String birt_date) {
        this.birth_date = birt_date;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public String getGender() {
        return gender;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;


    }
}
