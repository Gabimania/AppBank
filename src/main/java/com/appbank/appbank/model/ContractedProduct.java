package com.appbank.appbank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PRODUCTOS_CONTRATADOS", schema = "APPBANK")
@JsonIgnoreProperties("operationDone")

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

    @OneToMany(mappedBy = "contractedProduct", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OperationDone> operationDone;

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

    public List<OperationDone> getOperationDone() {
        return operationDone;
    }

    public void setOperationDone(List<OperationDone> operationDone) {
        this.operationDone = operationDone;
    }


}
