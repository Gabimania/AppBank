package com.appbank.appbank.model.dao;

import com.appbank.appbank.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
