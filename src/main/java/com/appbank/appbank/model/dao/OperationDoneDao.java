package com.appbank.appbank.model.dao;

import com.appbank.appbank.model.ContractedProduct;
import com.appbank.appbank.model.OperationDone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationDoneDao extends JpaRepository<OperationDone, Integer> {
}
