package com.appbank.appbank.model.dao;

import com.appbank.appbank.model.ContractedProduct;
import com.appbank.appbank.model.Customer;
import com.appbank.appbank.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductosContratadosDao extends JpaRepository<ContractedProduct, Integer> {
    List<ContractedProduct> findByCustomer(Customer customer);

    List<ContractedProduct> findByProduct(Product product);

    //List<ContractedProduct> findByProduct(Product product);


    // Optional<ContractedProduct> findByProduct_IdProductAndCustomer_IdCustomer(int id_product, int id_customer);

   // @Query("SELECT cp FROM ContractedProduct cp WHERE cp.product.id_product = :idProduct AND cp.customer.id_customer = :idCustomer")
   // Optional<ContractedProduct> findByProduct_IdProductAndCustomer_IdCustomer(int idProduct, int idCustomer);

}

