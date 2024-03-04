package com.appbank.appbank.model.dao;

import com.appbank.appbank.model.ContractedProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductosContratadosDao extends JpaRepository<ContractedProduct, Integer> {

   // Optional<ContractedProduct> findByProduct_IdProductAndCustomer_IdCustomer(int id_product, int id_customer);

   // @Query("SELECT cp FROM ContractedProduct cp WHERE cp.product.id_product = :idProduct AND cp.customer.id_customer = :idCustomer")
   // Optional<ContractedProduct> findByProduct_IdProductAndCustomer_IdCustomer(int idProduct, int idCustomer);

}

