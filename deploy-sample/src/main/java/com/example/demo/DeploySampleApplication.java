package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeploySampleApplication {

	@RequestMapping("/sample")
	public String home() {
		return "Hello Deploy Sample!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DeploySampleApplication.class, args);
	}

	
}
