package com.archaether.demoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServerApplication.class, args);
	}
	User user = new User("bob", "password", 01);

	@GetMapping("/hello")
		public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
			return String.format("Hello %s!", name);
		}
	
	@GetMapping("/user")
	@CrossOrigin(origins = "http://localhost:4200")
	public User user(){
 		return user;
	}
	

}
