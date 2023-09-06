package com.Arsac.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(FirstProjectApplication.class, args);
		
		// this get bean method belongs to the applicationcontext class that import is required .
		Alien obj = context.getBean(Alien.class);
		
		obj.code();
	}

}
