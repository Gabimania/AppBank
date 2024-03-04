package com.appbank.appbank.controller;

import com.appbank.appbank.api.ICustomerService;
import com.appbank.appbank.model.dto.ContractRequestDTO;
import com.appbank.appbank.model.dto.CustomerDTO;
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
    public ResponseEntity<String> contractProduct(@RequestBody ContractRequestDTO contractRequestDTO) {
        int id_customer = contractRequestDTO.getId_customer();
        int id_product = contractRequestDTO.getId_product();
        customerService.contractProduct(id_customer, id_product);
        return ResponseEntity.ok("The product has been contracted successfully");
    }

    @DeleteMapping("/deleteproduct")
    public ResponseEntity<String> deleteProduct(@RequestBody ContractRequestDTO contractRequestDTO){
        int id_producto_contratado = contractRequestDTO.getId_producto_contratado();
        customerService.deleteContractedProduct(id_producto_contratado);
        return ResponseEntity.ok("The product has been uncontracted");
    }


}
