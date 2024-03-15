package com.appbank.appbank.model.dao;

import com.appbank.appbank.model.ContractedProduct;
import com.appbank.appbank.model.OperationDone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperationDoneDao extends JpaRepository<OperationDone, Integer> {

}
