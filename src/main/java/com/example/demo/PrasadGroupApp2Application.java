package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrasadGroupApp2Application {

	@GetMapping("/testMessage")
	public String getWishes() {
		return "Hello Prasad Group Chairman Brand MD ...App2";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PrasadGroupApp2Application1.class, args);
	}

}
