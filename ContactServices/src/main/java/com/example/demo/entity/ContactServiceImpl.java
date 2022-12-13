package com.example.demo.entity;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
@Service
public class ContactServiceImpl implements ContactService {

	//fake data
	
	List<Contact> list=List.of(
		new Contact(1L,"sandip@gmail.com","Sandip",1211L),
		new Contact(2L,"nikhil@gmail.com","Nikhil",1221L),
		new Contact(3L,"shubham@gmail.com","Shubham",1231L),
		new Contact(1L,"shreyas@gmail.com","Shreyas",1241L)
			);
	@Override
	public List<Contact> getContactsofUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
