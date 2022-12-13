package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Bookdto;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import com.twilio.twiml.voice.Sms;

@RestController
public class BookController {
	
@Autowired
BookService bookService;

@PostMapping("/save")
public ResponseEntity<String> save(@RequestBody Bookdto bookdto){
	return bookService.saveinfo(bookdto);
}


@GetMapping("/findByfirstName/{firstName}")
public Optional<Book> getByfirstName(@PathVariable("firstName")String firstName){
    return bookService.getByFirstName(firstName);
}

@GetMapping("/findByuserName/{userName}")
public Optional<Book> getByUsername(@PathVariable("userName")String userName){
	return bookService.findByuserName(userName);
}

@GetMapping("/findByemail/{email}")
public Optional<Book> getemail(@PathVariable ("email") String email){
	return bookService.findByemail(email);
}

@DeleteMapping("/deleteByid/{userId}")
public ResponseEntity<String> deleteUser(@PathVariable ("userId")Long userId){
	return bookService.deleteById(userId);
}
@GetMapping("/allUser")
public List<Book> allinfo(){
	return bookService.allinfo();
	
}

@GetMapping("/findById/{userId}")
public Optional<Book> getbyId(@PathVariable("userId")Long userId){
	return bookService.getById(userId);
}

@PutMapping("/update/{userId}")
public ResponseEntity<String> updateData(@PathVariable ("userId")Long userId,@RequestBody Bookdto bookdto){
	return bookService.updatedata(userId,bookdto);
}

@GetMapping("/Sendotp")
public ResponseEntity<String> sendOTP(){
	
	return bookService.sendOtp();
}

}
