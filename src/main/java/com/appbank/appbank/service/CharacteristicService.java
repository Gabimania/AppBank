package com.appbank.appbank.service;

import com.appbank.appbank.model.Characteristic;
import com.appbank.appbank.api.ICharacteristicService;
import com.appbank.appbank.model.dao.CharacteristicDao;
import com.appbank.appbank.model.dto.CharacteristicDTO;
import com.appbank.appbank.model.dto.dtomapper.CharacteristicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("CharacteristicService")
@Lazy
public class CharacteristicService implements ICharacteristicService {
    @Autowired
    private CharacteristicDao characteristicDao;
    @Override
    public CharacteristicDTO queryCharacteristic(CharacteristicDTO characteristicDTO) {
        Characteristic characteristic = CharacteristicMapper.INSTANCE.toEntity(characteristicDTO);
        return CharacteristicMapper.INSTANCE.toDTO(characteristicDao.getReferenceById(characteristic.getId_characteristic()));
    }

    @Override
    public List<CharacteristicDTO> queryAlCharacteristics() {
        return CharacteristicMapper.INSTANCE.toDTOList(characteristicDao.findAll());
    }

    @Override
    public int insertCharacteristic(CharacteristicDTO characteristicDTO) {
       Characteristic characteristic = CharacteristicMapper.INSTANCE.toEntity(characteristicDTO);
       characteristicDao.saveAndFlush(characteristic);
       return characteristic.getId_characteristic();
    }

    @Override
    public int updateCharacteristic(CharacteristicDTO characteristicDTO) {
        return insertCharacteristic(characteristicDTO);
    }

    @Override
    public int deleteCharacteristic(CharacteristicDTO characteristicDTO) {
        int id = characteristicDTO.getId();
        Characteristic characteristic = CharacteristicMapper.INSTANCE.toEntity(characteristicDTO);
        characteristicDao.delete(characteristic);
        return id;
    }
}
