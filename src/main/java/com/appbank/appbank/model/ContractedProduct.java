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



}
