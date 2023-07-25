package com.sta.spTest01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpTest01Application {
	private static final Logger log = LoggerFactory.getLogger(SpTest01Application.class);
	public static void main(String[] args) {
		log.info("---------------------------------------------");
		log.info("log in the main class");
		log.info("---------------------------------------------");
		SpringApplication.run(SpTest01Application.class, args);
	}
	@GetMapping("/hello")
	public String hello(){
		return "Hello MilvaTech";
	}
}
