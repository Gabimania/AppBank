package com.appbank.appbank.service;

import com.appbank.appbank.api.IEmployeeService;
import com.appbank.appbank.model.Employee;
import com.appbank.appbank.model.dao.EmployeeDao;
import com.appbank.appbank.model.dto.EmployeeDTO;
import com.appbank.appbank.model.dto.dtomapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EmployeeService")
@Lazy
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public EmployeeDTO queryEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.INSTANCE.toEntity(employeeDTO);
        return EmployeeMapper.INSTANCE.toDTO(employeeDao.getReferenceById(employee.getId_employee()));
    }

    @Override
    public List<EmployeeDTO> queryAllEmployees() {
        return EmployeeMapper.INSTANCE.toDTOList(this.employeeDao.findAll());
    }

    @Override
    public int insertEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.INSTANCE.toEntity(employeeDTO);
        employeeDao.saveAndFlush(employee);
        return employee.getId_employee();
    }

    @Override
    public int updateEmployee(EmployeeDTO employeeDTO) {
        return insertEmployee(employeeDTO);
    }

    @Override
    public int deleteEmployee(EmployeeDTO employeeDTO) {
        int id = employeeDTO.getId_employee();
        Employee employee = EmployeeMapper.INSTANCE.toEntity(employeeDTO);
        employeeDao.delete(employee);
        return id;
    }
}
