package com.vk.Phonebookapp.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vk.Phonebookapp.model.PhonebookEntity;
import com.vk.Phonebookapp.service.PhoneBookServiceI;

@RestController
public class PhonebookController {

	@Autowired
	private PhoneBookServiceI phoneBookServiceI;
	
	
	@GetMapping(value = "/saveContact",consumes = "APLLICATION/JOSN")
	public ResponseEntity<String> saveContact(@RequestBody PhonebookEntity contact){
		
		boolean saveContact = phoneBookServiceI.saveContact(contact);
		if(saveContact==true) {
			
			String msg="Contact save Succesfully";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);

		}else {
			String msg="contact not save seccesfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}}
}
