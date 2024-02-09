package com.appbank.appbank.model.dto.dtomapper;

import com.appbank.appbank.model.Employee;
import com.appbank.appbank.model.dto.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    EmployeeDTO toDTO(Employee employee);
    List<EmployeeDTO> toDTOList(List<Employee>employees);
    Employee toEntity(EmployeeDTO employeeDTO);

}
