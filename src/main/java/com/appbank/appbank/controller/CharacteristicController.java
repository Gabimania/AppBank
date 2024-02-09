package com.appbank.appbank.controller;

import com.appbank.appbank.api.ICharacteristicService;
import com.appbank.appbank.model.dto.CharacteristicDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characteristics")
public class CharacteristicController {
    @Autowired
    private ICharacteristicService characteristicService;
    @PostMapping (value = "/get")
    public CharacteristicDTO queryCharacteristic(@RequestBody CharacteristicDTO characteristicDTO){
        return characteristicService.queryCharacteristic(characteristicDTO);
    }
    @GetMapping(value = "/getAll")
    public List<CharacteristicDTO> queryAllCharacteristics(){
        return characteristicService.queryAlCharacteristics();
    }
    @PostMapping(value = "/add")
    public int addCharacteristic(@RequestBody CharacteristicDTO characteristicDTO){
        return characteristicService.insertCharacteristic(characteristicDTO);
    }
    @PutMapping(value = "/update")
    public int updateCharacteristic(@RequestBody CharacteristicDTO characteristicDTO){
        return characteristicService.updateCharacteristic(characteristicDTO);
    }
    @DeleteMapping(value = "/delete")
    public int deleteCharacteristic(@RequestBody CharacteristicDTO characteristicDTO){
        return characteristicService.deleteCharacteristic(characteristicDTO);
    }
}
