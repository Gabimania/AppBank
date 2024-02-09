package com.appbank.appbank.api;

import com.appbank.appbank.model.dto.OperationDTO;

import java.util.List;

public interface IOperationService {
    OperationDTO queryOperation(OperationDTO operationDTO);
    List<OperationDTO> queryAllOperations();

    int insertOperation(OperationDTO operationDTO);
    int updateOperation(OperationDTO operationDTO);
    int deleteOperation(OperationDTO operationDTO);
}
