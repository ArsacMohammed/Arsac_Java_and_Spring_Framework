package com.Arsac.springMVCBoot.QuizApp.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Arsac.springMVCBoot.QuizApp.Question;
import com.Arsac.springMVCBoot.QuizApp.Service.QuestionService;
@RestController
@RequestMapping("/question")

public class QuestionController {
	@Autowired
	QuestionService questionService;
	@GetMapping(value="allQuestions",produces="application/json")
	@ResponseBody
	public List<Question>getQuestions() {
		System.out.println("hello");
		return questionService.getQuestions();
		
	}
}
/// client - controller - service layer - dao layer - database (from server)

//I am getting this as output
/*[{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{}]*/