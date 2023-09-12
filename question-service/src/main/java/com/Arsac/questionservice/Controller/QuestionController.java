package com.Arsac.questionservice.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Arsac.questionservice.Service.QuestionService;
import com.Arsac.questionservice.model.Question;
import com.Arsac.questionservice.model.QuestionWrapper;
import com.Arsac.questionservice.model.Response;

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
	@GetMapping("create")
	public ResponseEntity<List<Integer>> getQuestionForQuiz(@RequestParam String category,@RequestParam int numberOfQuestions){
		return  questionService.getQuestionForQuiz(numberOfQuestions,category);
	}
	@PostMapping("getQuestion")
	public ResponseEntity<List<QuestionWrapper>> getQuestionFromId(@RequestBody List<Integer> questionId){
		return questionService.getQuestionById(questionId);
		
	}
	@PostMapping("getscore")
	public ResponseEntity<Integer> calculateScore(@RequestBody List<Response> responses){
		return questionService.calculateScore(responses);
	}
}
