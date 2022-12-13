package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CsvFile;

public interface CsvRepository extends JpaRepository<CsvFile,String>  {

}
