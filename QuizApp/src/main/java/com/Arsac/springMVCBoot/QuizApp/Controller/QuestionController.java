package com.Arsac.springMVCBoot.QuizApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Arsac.springMVCBoot.QuizApp.question;
import com.Arsac.springMVCBoot.QuizApp.Service.QuestionService;


@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	@GetMapping("allQuestions")
	public List<question>getQuestions() {
		System.out.println("hello");
		return questionService.getQuestions();
		
	}
}
/// client - controller - service layer - dao layer - database (from server)

//I am getting this as output
/*[{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{}]*/