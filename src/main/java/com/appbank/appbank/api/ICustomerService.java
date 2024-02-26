package com.appbank.appbank.api;

import com.appbank.appbank.model.dto.CustomerDTO;

import java.util.List;

public interface ICustomerService {
    CustomerDTO queryCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> queryAllCustomers();
    int insertCustomer(CustomerDTO customerDTO);
    int updateCustomer(CustomerDTO customerDTO);
    int deleteCustomer(CustomerDTO customerDTO);


}
