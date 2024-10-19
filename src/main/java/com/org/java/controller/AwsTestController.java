package com.org.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.java.entity.Aws;
import com.org.java.service.AwsService;


@RestController
@RequestMapping("/aws")
public class AwsTestController {
	
	@Autowired
	private AwsService awsService;
	
	@GetMapping("/welcome")
	public String awsWelcomeTest() {
		return "WELCOME TO AWS COULD FOR TESTING IT IS A NEW FOR AWS CLOULD...";
		
	}
	@GetMapping("/testnew")
	public String awsWelcomenewTest() {
		return "HI EVERY ONE PLASE WELCOME TO AWS FAMILY...I HAVE CHANGED RECENTLY...";
		
	}
	@PostMapping("/save")
	public ResponseEntity<Aws> saveStudent(@RequestBody Aws aws){
		Aws awstest=awsService.saveAwsDetails(aws);
		return new ResponseEntity<>(awstest,HttpStatus.CREATED);	
	}
	@GetMapping("/findAll")
	public ResponseEntity<Aws> findAllStudent(){
		List<Aws> awsList=awsService.findAllAwsDetails();
		return new ResponseEntity(awsList,HttpStatus.OK);
		
	}

}
