package com.example.demo.serviceImpl;


import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookRepository;
import com.example.demo.dto.Bookdto;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;



@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;
	

	@Override
	public ResponseEntity<String> saveinfo(Bookdto bookdto) {
		Book book=new Book();
			book.setFirstName(bookdto.getFirstName());
			book.setLastName(bookdto.getLastName());
				
		
		
		Optional<Book> username=bookRepository.findByuserName(bookdto.getUserName());
		if(!username.isPresent()) {

			book.setUserName(bookdto.getUserName());
		
		}else {
			return new ResponseEntity<>("USERNAME ALREADY EXIST ",HttpStatus.OK); 
		 }
		

		Optional<Book> email=bookRepository.findByemail(bookdto.getEmail());
		if(!email.isPresent()) {
			book.setEmail(bookdto.getEmail());	
		}else {
			return new ResponseEntity<>("EMAIL ALREADY EXIST ",HttpStatus.OK);
		}
		
	    book.setMobileNo(bookdto.getMobileNo());
		book.setPassword(bookdto.getPassword()); 
		book.setBookName(bookdto.getBookName());
		book.setAuthorName(bookdto.getAuthorName());
		bookRepository.save(book);
		
		return new ResponseEntity<>("200 SUCCESSFULL REGISTERED",HttpStatus.OK); 
	}
	

	@Override
	public Optional<Book> getByFirstName(String firstName) {
		Optional<Book> optional=bookRepository.findByFirstName(firstName);
		
		return optional;
	}

	@Override
	public Optional<Book> findByuserName(String userName) {
		Optional<Book> optional=bookRepository.findByuserName(userName);
		return optional;
	}

	@Override
	public Optional<Book> findByemail(String email) {
		Optional<Book> optional=bookRepository.findByemail(email);
		return optional;
	}

	@Override
	public ResponseEntity<String> deleteById(Long userId) {
		bookRepository.deleteById(userId);
		 return new ResponseEntity<>("DELETE SUCCESSFULLY",HttpStatus.OK); 
	}

	@Override
	public List<Book> allinfo() {
		List<Book> list=bookRepository.findAll();
		return 	list;
	}

	@Override
	public Optional<Book> getById(Long userId) {
		return bookRepository.findById(userId) ;
	}

	@Override
	public ResponseEntity<String> updatedata(Long userId, Bookdto bookdto) {
		ResponseEntity<String> msg=new ResponseEntity<>(" ",HttpStatus.OK);
		Optional<Book> user=((CrudRepository<Book, Long>) bookdto).findById(userId);
		if(user.isPresent()) {
			Book book=bookRepository.getById(userId);
			book.setFirstName(bookdto.getFirstName());
			book.setLastName(bookdto.getLastName());
		
			bookRepository.save(book);
			msg=new ResponseEntity<>("Updated Sucessfully... ",HttpStatus.OK);
			
		}else {
			
			msg=new ResponseEntity<>("User Not Exist... ",HttpStatus.OK);	
		}
		return msg;
	}
	
	@Value("${fromPhoneNo}")
	private String from;

	@Value("${toPhoneNo}")
	private String to;

	@Value("${accountSID}")
	private String ACCOUNT_SID;

	@Value("${authToken}")
	private String AUTH_TOKEN;

	@Override
	public ResponseEntity<String> sendOtp() {
		int max = 10000000;
		int min = 20000000;
		Long a = (long) (Math.random() * (max - min + 1) + min);
		String msg = "Your OTP is " + a;
		try {
			Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
			Message message = Message.creator(new PhoneNumber(to), new PhoneNumber(from), msg) 
																								
					.setMediaUrl(Arrays.asList(URI.create("https://demo.twilio.com/owl.png"))) 
																								
					.setStatusCallback(URI.create("http://postb.in/1234abcd")) 
					.create();
			System.out.println(message);
			System.out.println(message.getSid());
			return new ResponseEntity<>("OTP Send Successfully...", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("OTP Send Failed...", HttpStatus.OK);
	}


	

}
