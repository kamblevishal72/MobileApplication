package com.vk.Phonebookapp.jpaRepository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vk.Phonebookapp.model.PhonebookEntity;

@Repository
public interface PhonebookappJapRepository extends JpaRepository<PhonebookEntity, Serializable> {

}
