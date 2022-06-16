package com.vk.Phonebookapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.Phonebookapp.jpaRepository.PhonebookappJapRepository;
import com.vk.Phonebookapp.model.PhonebookEntity;

@Service
public class PhonebookServiceImpl implements PhoneBookServiceI {

	@Autowired
	private PhonebookappJapRepository phonebookappJapRepository;
	
	
	@Override
	public boolean saveContact(PhonebookEntity contact) {
		PhonebookEntity save = phonebookappJapRepository.save(contact);
		
		if(save !=null) {
		return true;
		}else {
			return false;
		}
	}

}
