package com.example.demo.entity;

import java.util.List;

public interface ContactService {

	public List<Contact> getContactsofUser(Long userId);
	
}
