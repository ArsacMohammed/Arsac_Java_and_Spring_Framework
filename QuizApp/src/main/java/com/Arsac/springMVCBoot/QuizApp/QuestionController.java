package com.Arsac.springMVCBoot.QuizApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {
	@GetMapping("allQuestions")
	public String getQuestions() {
		return "Hi here are the questions";
	}
}
//configured the application properties for postgres database and added data into the database as table name question
//added the above method to check every dependencies working fine as expected .
//added dependencies like spring web,postges sql driver ,data jpa ,lomkat in creating the project 
//run succesfull