package com.appbank.appbank.service;

import com.appbank.appbank.api.ICustomerService;
import com.appbank.appbank.model.ContractedProduct;
import com.appbank.appbank.model.Customer;
import com.appbank.appbank.model.Product;
import com.appbank.appbank.model.dao.CustomerDao;
import com.appbank.appbank.model.dao.ProductDao;
import com.appbank.appbank.model.dao.ProductosContratadosDao;
import com.appbank.appbank.model.dto.CustomerDTO;
import com.appbank.appbank.model.dto.ProductDTO;
import com.appbank.appbank.model.dto.dtomapper.CustomerMapper;
import com.appbank.appbank.model.dto.dtomapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("CustomerService")
@Lazy
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ProductosContratadosDao productosContratadosDao;

    private CustomerDTO customerLogged;

    @Override
    public CustomerDTO queryCustomer(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.INSTANCE.toEntity(customerDTO);
        return CustomerMapper.INSTANCE.toDTO(customerDao.getReferenceById(customer.getId_customer()));
    }

    @Override
    public List<CustomerDTO> queryAllCustomers() {
        return CustomerMapper.INSTANCE.toDTOList(this.customerDao.findAll());
    }

    @Override
    public int insertCustomer(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.INSTANCE.toEntity(customerDTO);
        customerDao.saveAndFlush(customer);
        return customer.getId_customer();
    }

    @Override
    public int updateCustomer(CustomerDTO customerDTO) {
        return insertCustomer(customerDTO);
    }

    @Override
    public int deleteCustomer(CustomerDTO customerDTO) {
       int id = customerDTO.getId_customer();
       Customer customer = CustomerMapper.INSTANCE.toEntity(customerDTO);
       customerDao.delete(customer);
       return id;
    }

    @Override
    public boolean login(String name, String dni, int password){
        Customer customer = customerDao.findByNameAndDniAndPassword(name, dni, password);
        if(customer != null){
            customerLogged = new CustomerDTO(customer.getName(),customer.getDni(),customer.getPassword());
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean isCustomerLogged(){
        return customerLogged != null;
    }

    @Override
    public void logout() {
        // Lógica para cerrar sesión
        customerLogged = null;
    }

    @Override
    public void contractProduct(int id_customer, int id_product){
        if(isCustomerLogged()){
            Customer customer = customerDao.findById(id_customer).
                    orElseThrow(() -> new RuntimeException("Costumer not found"));
            Product product = productDao.findById(id_product)
                    .orElseThrow(() -> new RuntimeException("Product not found"));
            ContractedProduct contractedProduct = new ContractedProduct();
            contractedProduct.setCustomer(customer);
            contractedProduct.setProduct(product);

            productosContratadosDao.save(contractedProduct);
        }else{
            throw new RuntimeException("User not logged in");
        }

    }
    @Override
    public void deleteContractedProduct(int id_producto_contratado){
        if(isCustomerLogged()){
            ContractedProduct contractedProduct = productosContratadosDao.findById(id_producto_contratado)
                    .orElseThrow(() -> new RuntimeException("Contracted product not found"));

            productosContratadosDao.delete(contractedProduct);
        }else{
            throw new RuntimeException("User not logged in");
        }


}

@Override
public List<ProductDTO> getContractedProductsByCustomer(int id_customer){
        Customer customer = customerDao.findById(id_customer)
                .orElseThrow(()-> new RuntimeException("Customer not found"));
        List<ContractedProduct> contractedProducts = productosContratadosDao.findByCustomer(customer);

    List<ProductDTO> contractedProductByUser = contractedProducts.stream()
            .map(contractedProduct -> ProductMapper.INSTANCE.toDTO(contractedProduct.getProduct()))
            .collect(Collectors.toList());

    return contractedProductByUser;


}
    }






