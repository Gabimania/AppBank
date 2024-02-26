package com.appbank.appbank.model.dao;

import com.appbank.appbank.model.ContractedProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductosContratadosDao extends JpaRepository<ContractedProduct, Integer> {

    Optional<ContractedProduct> findByProduct_IdProductAndCustomer_IdCustomer(int id_product, int id_customer);
}

