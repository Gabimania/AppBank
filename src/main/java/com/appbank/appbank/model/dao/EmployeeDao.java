package com.appbank.appbank.model.dao;

import com.appbank.appbank.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
