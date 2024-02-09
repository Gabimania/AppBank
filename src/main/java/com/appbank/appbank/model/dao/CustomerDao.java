package com.appbank.appbank.model.dao;

import com.appbank.appbank.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
