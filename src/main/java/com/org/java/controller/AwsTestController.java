package com.org.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class AwsTestController {
	
	@GetMapping("/welcome")
	public String awsWelcomeTest() {
		return "WELCOME TO AWS COULD FOR TESTING IT IS A NEW FOR AWS CLOULD...";
		
	}
	@GetMapping("/welcomenew")
	public String awsWelcomenewTest() {
		return "HI ALL EVERY ONE...";
		
	}

}
