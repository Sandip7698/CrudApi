package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface CsvService {

	ResponseEntity<String> uploadFile(MultipartFile multipartFile) throws Exception;

}
