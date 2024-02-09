package com.appbank.appbank.api;

import com.appbank.appbank.model.dto.EmployeeDTO;

import java.util.List;

public interface IEmployeeService {

    EmployeeDTO queryEmployee(EmployeeDTO employeeDTO);
    List<EmployeeDTO> queryAllEmployees();

    int insertEmployee(EmployeeDTO employeeDTO);

    int updateEmployee(EmployeeDTO employeeDTO);

    int deleteEmployee(EmployeeDTO employeeDTO);



}
