package com.appbank.appbank.api;

import com.appbank.appbank.model.dto.CharacteristicDTO;

import java.util.List;

public interface ICharacteristicService {

    CharacteristicDTO queryCharacteristic(CharacteristicDTO characteristicDTO);
    List<CharacteristicDTO> queryAlCharacteristics();
    int insertCharacteristic(CharacteristicDTO characteristicDTO);
    int updateCharacteristic(CharacteristicDTO characteristicDTO);
    int deleteCharacteristic(CharacteristicDTO characteristicDTO);

}
