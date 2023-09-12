package com.Arsac.questionservice.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.Arsac.questionservice.Service.QuestionService;
import com.Arsac.questionservice.model.Question;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	@GetMapping(value="allQuestions",produces="application/json")
	
	public ResponseEntity<List<Question>>getQuestions() {
		System.out.println("hello");
		return questionService.getQuestions();
		
	}
	@GetMapping("category/{cat}")
	public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable("cat") String category){
		return questionService.getQuestionsByCategory(category);
	}
	@PostMapping("addQuestion")
	public ResponseEntity<String> addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}
}
//generate 
//getQuestion(question_id)
//calculateScore() these all have to done here because it has all the resources in the question service 
//instead of connecting the quiz to  the question database ,we use http to connect the quiz-service and question-service as micro-service .