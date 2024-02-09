package com.appbank.appbank.model.dto.dtomapper;

import com.appbank.appbank.model.Customer;
import com.appbank.appbank.model.dto.CustomerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDTO toDTO(Customer customer);

    List<CustomerDTO> toDTOList(List<Customer>customers);

    Customer toEntity (CustomerDTO customerDTO);
}
