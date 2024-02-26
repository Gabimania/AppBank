package com.appbank.appbank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCTOS_CONTRATADOS", schema = "APPBANK")

public class ContractedProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto_contratado;

    @ManyToOne
    @JoinColumn(name = "COSTUMERS_ID_COSTUMER")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "PRODUCTS_ID_PRODUCT")
    private Product product;

    public int getId_producto_contratado() {
        return id_producto_contratado;
    }

    public void setId_producto_contratado(int id_producto_contratado) {
        this.id_producto_contratado = id_producto_contratado;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
