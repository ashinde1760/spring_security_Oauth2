package com.spring_security;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurityOauth2Application {

	@GetMapping
	public String welcome()
	{
		return "welcome to google";
	}
	
	
	@GetMapping("/user")
	public Principal user(Principal principal)
	{
		System.out.println("user: "+principal.getName());
		return principal;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauth2Application.class, args);
	}

}
