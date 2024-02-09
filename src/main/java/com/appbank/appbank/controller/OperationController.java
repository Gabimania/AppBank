package com.appbank.appbank.controller;

import com.appbank.appbank.api.IOperationService;
import com.appbank.appbank.model.dto.OperationDTO;
import com.appbank.appbank.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operations")
public class OperationController {
@Autowired
    private IOperationService operationService;
@PostMapping(value="/get")
public OperationDTO queryOperation(@RequestBody OperationDTO operationDTO){
    return operationService.queryOperation(operationDTO);
}
@GetMapping(value = "/getAll")
public List<OperationDTO> queryAllOperations(){
    return operationService.queryAllOperations();
}
@PostMapping(value = "/add")
public int addOperation(@RequestBody OperationDTO operationDTO){
    return operationService.insertOperation(operationDTO);
    }
 @PutMapping(value="/update")
 public int updateOperation(@RequestBody OperationDTO operationDTO){
    return operationService.updateOperation(operationDTO);
    }
    @DeleteMapping(value = "/delete")
    public int deleteOperation(@RequestBody OperationDTO operationDTO){
    return operationService.deleteOperation(operationDTO);
    }

}
