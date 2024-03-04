package com.appbank.appbank.model.dto;

public class ContractRequestDTO {

    private int id_producto_contratado;

    private int id_customer;
    private int id_product;

    public int getId_producto_contratado() {
        return id_producto_contratado;
    }

    public void setId_producto_contratado(int id_producto_contratado) {
        this.id_producto_contratado = id_producto_contratado;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }
}
