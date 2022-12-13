package com.example.demo.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	ContactService contactService;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId")Long userId){
		return this.contactService.getContactsofUser(userId);
	}

}
