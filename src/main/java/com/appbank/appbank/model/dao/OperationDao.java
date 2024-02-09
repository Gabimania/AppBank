package com.appbank.appbank.model.dao;
import com.appbank.appbank.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationDao extends JpaRepository<Operation, Integer> {
}
