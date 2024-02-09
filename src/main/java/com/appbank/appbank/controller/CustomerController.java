package com.appbank.appbank.controller;

import com.appbank.appbank.Customer;
import com.appbank.appbank.api.ICustomerService;
import com.appbank.appbank.model.dto.CustomerDTO;
import com.appbank.appbank.model.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping(value = "/info")
    public String info(){
        return customerService.contratar();
    }
}
