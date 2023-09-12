package com.Arsac.springMVCBoot.QuizApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Arsac.springMVCBoot.QuizApp.Question;
import com.Arsac.springMVCBoot.QuizApp.dao.QuestionDao;

@Service
public class QuizService {
	
	@Autowired
	private Quizdao quizDao;
	@Autowired 
	QuestionDao questionDao;
	public ResponseEntity<String> createQuiz(String category,int numQ,String title){
		List<Question> questions =questionDao.findRandomQuestionByCategory(category,numQ);
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questions);
		quizDao.save(quiz);
		return new ResponseEntity<>("Success",HttpStatus.OK);
	}
		
		
	
	
}
