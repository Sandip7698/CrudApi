package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.Bookdto;
import com.example.demo.model.Book;

public interface BookService {

	ResponseEntity<String> saveinfo(Bookdto bookdto);

	Optional<Book> getByFirstName(String firstName);

	Optional<Book> findByuserName(String userName);

	Optional<Book> findByemail(String email);

	ResponseEntity<String> deleteById(Long userId);

	List<Book> allinfo();

	ResponseEntity<String> updatedata(Long userId, Bookdto bookdto);

	Optional<Book> getById(Long userId);

	ResponseEntity<String> sendOtp();


}
