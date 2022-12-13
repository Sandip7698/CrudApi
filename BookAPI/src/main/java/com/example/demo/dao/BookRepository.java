package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

	Optional<Book> findByFirstName(String firstName);

	Optional<Book> findByLastName(String lastName);

	Optional<Book> findByuserName(String userName);

	Optional<Book> findByemail(String email);

   Optional<Book> findBymobileNo(long mobileNo);



	

}
