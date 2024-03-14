package com.appbank.appbank.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.time.LocalDate;



@Entity
@Table(name = "OPERATIONS_DONE", schema = "APPBANK")
public class OperationDone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_operation_done;

    @ManyToOne
    @JoinColumn(name = "OPERATIONS_ID_OPERATION")
    private Operation operation;


    @ManyToOne
    @JoinColumn(name = "PRODUCTOS_CONTRATADOS_ID_PRODUCTO_CONTRATADO")
    @JsonIgnore
    private ContractedProduct contractedProduct;


    @Column
    private int amount;


    public int getIdOperationDone() {
        return id_operation_done;
    }

    public void setIdOperationDone(int idOperationDone) {
        this.id_operation_done = idOperationDone;
    }

    public ContractedProduct getContractedProduct() {
        return contractedProduct;
    }

    public void setContractedProduct(ContractedProduct contractedProduct) {
        this.contractedProduct = contractedProduct;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
