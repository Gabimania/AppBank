package com.appbank.appbank.controller;

import com.appbank.appbank.Customer;
import com.appbank.appbank.api.ICustomerService;
import com.appbank.appbank.model.dto.CustomerDTO;
import com.appbank.appbank.model.dto.EmployeeDTO;
import com.appbank.appbank.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @PostMapping(value = "/get")
    public CustomerDTO queryCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.queryCustomer(customerDTO);
    }
    @GetMapping(value = "/getAll")
    public List<CustomerDTO> queryAllCustomers(){
        return customerService.queryAllCustomers();
    }
    @PostMapping(value = "/add")
    public int addCustomer(@RequestBody CustomerDTO customerDTO){

        return customerService.insertCustomer(customerDTO);
    }
    @PutMapping(value = "/update")
    public int updateEmployee(@RequestBody CustomerDTO customerDTO){
        return customerService.updateCustomer(customerDTO);
    }
    @DeleteMapping(value = "/delete")
    public int deleteCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.deleteCustomer(customerDTO);
    }

    @PostMapping(value = "/contractproduct")
    public ResponseEntity<String> contractProduct(@RequestBody CustomerDTO customerDTO, @RequestBody ProductDTO productDTO){
        int id_customer = customerDTO.getId_customer();
        int id_product = productDTO.getId_product();
        customerService.contractProduct(id_customer,id_product);
        return ResponseEntity.ok("The product has been contracted successfully");
    }
    @DeleteMapping("/deleteproduct")
    public ResponseEntity<String> deleteProduct(@RequestBody CustomerDTO customerDTO, @RequestBody ProductDTO productDTO){
        int id_customer = customerDTO.getId_customer();
        int id_product = productDTO.getId_product();
        customerService.deleteContractedProduct(id_product, id_customer);
        return ResponseEntity.ok("The product has been uncontracted");
    }


}
