package com.appbank.appbank.model.dto.dtomapper;

import com.appbank.appbank.model.Characteristic;
import com.appbank.appbank.model.dto.CharacteristicDTO;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CharacteristicMapper {

    CharacteristicMapper INSTANCE = Mappers.getMapper(CharacteristicMapper.class);
    CharacteristicDTO toDTO(Characteristic characteristic);

   List<CharacteristicDTO> toDTOList(List<Characteristic>characteristics);

    Characteristic toEntity(CharacteristicDTO characteristicDTO);


}
