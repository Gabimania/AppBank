package com.appbank.appbank.model.dao;

import com.appbank.appbank.model.ContractedProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosContratadosDao extends JpaRepository<ContractedProduct, Integer> {
    boolean existsByCustomer_IdCustomerAndProduct_IdProduct(int idCustomer, int idProduct);
}

