package com.appbank.appbank.controller;

import com.appbank.appbank.api.IEmployeeService;
import com.appbank.appbank.model.dto.EmployeeDTO;
import com.appbank.appbank.model.dto.OperationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @PostMapping(value = "/get")
    public EmployeeDTO queryEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.queryEmployee(employeeDTO);
    }
    @GetMapping(value = "/getAll")
    public List<EmployeeDTO> queryAllEmployees(){
        return employeeService.queryAllEmployees();
    }
    @PostMapping(value = "/add")
    public int addEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.insertEmployee(employeeDTO);
    }
    @PutMapping(value = "/update")
    public int updateEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.updateEmployee(employeeDTO);
    }
    @DeleteMapping(value = "/delete")
    public int deleteOperation(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.deleteEmployee(employeeDTO);
    }


}
