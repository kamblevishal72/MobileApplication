package com.vk.Phonebookapp.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vk.Phonebookapp.model.PhonebookEntity;


public interface PhonebookappJapRepository extends JpaRepository<PhonebookEntity, Integer> {

}
