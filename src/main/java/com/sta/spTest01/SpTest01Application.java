package com.sta.spTest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpTest01Application {

	public static void main(String[] args) {

		SpringApplication.run(SpTest01Application.class, args);
	}
	@GetMapping("/hello")
	public String hello(){
		return "Hello MilvaTech";
	}
}
