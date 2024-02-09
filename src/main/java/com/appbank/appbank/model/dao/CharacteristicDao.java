package com.appbank.appbank.model.dao;

import com.appbank.appbank.model.Characteristic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacteristicDao extends JpaRepository<Characteristic,Integer> {
}
