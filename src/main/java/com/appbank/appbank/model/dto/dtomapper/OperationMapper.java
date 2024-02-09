package com.appbank.appbank.model.dto.dtomapper;

import com.appbank.appbank.model.Operation;
import com.appbank.appbank.model.dto.OperationDTO;
import com.appbank.appbank.model.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OperationMapper {
    OperationMapper INSTANCE = Mappers.getMapper(OperationMapper.class);
    OperationDTO toDTO(Operation operation);
    List<OperationDTO> toDTOList(List<Operation>operations);
    Operation toEntity(OperationDTO operationDTO);
}
