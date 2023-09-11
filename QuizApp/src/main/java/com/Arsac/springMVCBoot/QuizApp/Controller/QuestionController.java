package com.Arsac.springMVCBoot.QuizApp.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.Arsac.springMVCBoot.QuizApp.Question;
import com.Arsac.springMVCBoot.QuizApp.Service.QuestionService;
@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	@GetMapping(value="allQuestions",produces="application/json")
	
	public List<Question>getQuestions() {
		System.out.println("hello");
		return questionService.getQuestions();
		
	}
	@GetMapping("category/{cat}")
	public List<Question> getQuestionsByCategory(@PathVariable("cat") String category){
		return questionService.getQuestionsByCategory(category);
	}
	@PostMapping("addQuestion")
	public String addQuestion(@RequestBody Question question) {
		questionService.addQuestion(question);
		return "success";
	}
}
