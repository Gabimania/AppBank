package com.appbank.appbank.model.dao;

import com.appbank.appbank.model.ContractedProduct;
import com.appbank.appbank.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
