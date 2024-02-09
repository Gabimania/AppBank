package com.appbank.appbank.service;

import com.appbank.appbank.api.IOperationService;
import com.appbank.appbank.model.Operation;
import com.appbank.appbank.model.dao.OperationDao;
import com.appbank.appbank.model.dto.OperationDTO;
import com.appbank.appbank.model.dto.dtomapper.OperationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("OperationService")
@Lazy
public class OperationService implements IOperationService {
    @Autowired
private OperationDao operationDao;
    @Override
    public OperationDTO queryOperation(OperationDTO operationDTO) {
        Operation operation = OperationMapper.INSTANCE.toEntity(operationDTO);
        return OperationMapper.INSTANCE.toDTO(operationDao.getReferenceById(operation.getId()));
    }

    @Override
    public List<OperationDTO> queryAllOperations() {
        return OperationMapper.INSTANCE.toDTOList(this.operationDao.findAll());
    }

    @Override
    public int insertOperation(OperationDTO operationDTO) {
       Operation operation = OperationMapper.INSTANCE.toEntity(operationDTO);
       operationDao.saveAndFlush(operation);
       return operation.getId();
    }

    @Override
    public int updateOperation(OperationDTO operationDTO) {
        return insertOperation(operationDTO);
    }

    @Override
    public int deleteOperation(OperationDTO operationDTO) {
       int id = operationDTO.getId_operation();
       Operation operation = OperationMapper.INSTANCE.toEntity(operationDTO);
       operationDao.delete(operation);
       return  id;
    }
}
