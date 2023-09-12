package com.Arsac.springMVCBoot.QuizApp.Controller;


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

import com.Arsac.springMVCBoot.QuizApp.Service.QuizService;
import com.Arsac.springMVCBoot.QuizApp.model.QuestionWrapper;
import com.Arsac.springMVCBoot.QuizApp.model.Response;

@RestController
@RequestMapping("quiz")
public class QuizController {
	@Autowired
	private QuizService quizService;
	@PostMapping("create")
	public ResponseEntity<String> createquiz (@RequestParam String category,@RequestParam int numQ,@RequestParam String title) {
		return quizService.createQuiz(category,numQ,title);
	}
	
	@GetMapping("get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestionForUser(@PathVariable int id){
		return quizService.getQuestionForUser(id);
	}
	@PostMapping("submit/{id}")
	public ResponseEntity<Integer> submit(@PathVariable int id ,@RequestBody List<Response>response){
		return quizService.calculateScore(id,response);
	}

}
//@RequestBody send data by converting  particular format to java object to the server.