package com.appbank.appbank.api;

import com.appbank.appbank.model.dto.CustomerDTO;

import java.util.List;

public interface ICustomerService {
    CustomerDTO queryCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> queryAllCustomers();
    int insertCustomer(CustomerDTO customerDTO);
    int updateCustomer(CustomerDTO customerDTO);
    int deleteCustomer(CustomerDTO customerDTO);

    void contractProduct(int id_customer, int id_product);

    boolean productIsContracted(int id_customer, int id_product);
}
