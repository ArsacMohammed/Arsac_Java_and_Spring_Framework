package com.Arsac.springMVCBoot.QuizApp.Controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
public class QuizController {
	@Autowired
	private QuizService quizService;
	@PostMapping("create")
	public ResponseEntity<String> createquiz (@RequestParam String category,@RequestParam int numQ,@RequestParam String title) {
		return quizService.createQuiz(category,numQ,title);
	}
	
}
