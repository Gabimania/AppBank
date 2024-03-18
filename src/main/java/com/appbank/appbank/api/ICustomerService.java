package com.appbank.appbank.api;

import com.appbank.appbank.model.ContractedProduct;
import com.appbank.appbank.model.OperationDone;
import com.appbank.appbank.model.dto.CustomerDTO;
import com.appbank.appbank.model.dto.ProductDTO;

import java.util.List;

public interface ICustomerService {
    CustomerDTO queryCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> queryAllCustomers();
    int insertCustomer(CustomerDTO customerDTO);
    int updateCustomer(CustomerDTO customerDTO);
    int deleteCustomer(CustomerDTO customerDTO);


    boolean login(String name, String dni, int password);
    boolean isCustomerLogged();

    void logout();

    void contractProduct(int id_customer, int id_product);
    void deleteContractedProduct(int id_producto_contratado);

    List<ProductDTO> getContractedProductsByCustomer(int id_customer);

    void doAnOperation(int id_producto_contratado, int id_operation, int amount);

    List<OperationDone> getAllOperationsByCustomer();

    List<OperationDone> getOperationsByContractedProduct(int id_product);



}
