package com.appbank.appbank.model.dto;

public class OperationRequestDTO {

    private int id_producto_contratado;

    private int id_operation;

    private int amount;

    public int getId_producto_contratado() {
        return id_producto_contratado;
    }

    public void setId_producto_contratado(int id_producto_contratado) {
        this.id_producto_contratado = id_producto_contratado;
    }

    public int getId_operation() {
        return id_operation;
    }

    public void setId_operation(int id_operation) {
        this.id_operation = id_operation;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
