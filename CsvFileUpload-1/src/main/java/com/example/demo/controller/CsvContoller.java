package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.service.CsvService;

@RestController
public class CsvContoller {
@Autowired
CsvService csvService;


@PostMapping("/fileupload")
public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile multipartFile) throws Exception {
	return csvService.uploadFile(multipartFile);
}
}
