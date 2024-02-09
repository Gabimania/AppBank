package com.appbank.appbank;

public class Employee {
   private String name;
   private String surname;
   private String email;
    private String dni;
   private String city;
   private String date_hired;

   private int password;

    public Employee(String name, String surname, String dni, String date_hired, int password) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.date_hired = date_hired;
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

    public String getDate_hired() {
        return date_hired;
    }



    public void setDate_hired(String date_hired) {
        this.date_hired = date_hired;


    }
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
