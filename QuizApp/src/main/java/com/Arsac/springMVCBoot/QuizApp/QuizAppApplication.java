package com.Arsac.springMVCBoot.QuizApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Starting Quiz App from now ...................................................
@SpringBootApplication
public class QuizAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizAppApplication.class, args);
	}

}
/*
@Controller
A class annotated with @Controller is used to create a traditional web controller in Spring.
It is typically used when you want to build a web application where you render views (HTML templates) and return them as responses.
Methods in a @Controller class return a String representing the name of the view to be rendered, and the view is usually an HTML template.
These controllers are suitable for building web applications that serve HTML pages and handle form submissions.


@RestController : 
A class annotated with @RestController is used to create a RESTful web service controller in Spring.
It is designed for building APIs that return data in formats like JSON or XML.
Methods in a @RestController class return the actual data object that will be converted into the desired response format (e.g., JSON).
These controllers are suitable for building APIs that are consumed by clients such as mobile apps or other web services.
*/