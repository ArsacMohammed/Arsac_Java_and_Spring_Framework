package com.Arsac.quizservice.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Arsac.quizservice.dao.Quizdao;
import com.Arsac.quizservice.model.QuestionWrapper;
import com.Arsac.quizservice.model.Quiz;



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
	public ResponseEntity<List<QuestionWrapper>> getQuestionForUser(int id) {
		Optional<Quiz> q =quizDao.findById(id);
		List<Question> quesFromDb = q.get().getQuestions();
		List<QuestionWrapper> qw = new ArrayList<>();
		for (Question Q :quesFromDb) {
			qw.add(new QuestionWrapper(Q.getId(),Q.getQuestion_title(),Q.getOption1(),Q.getOption2(),Q.getOption3(),Q.getOption4()));
		}
		return new ResponseEntity<>(qw,HttpStatus.OK);
	}
	public ResponseEntity<Integer> calculateScore(int id,List<Response> responses) {
		Quiz quiz=quizDao.findById(id).get();
		List<Question> questions = quiz.getQuestions();
		int i=0;
		int right=0;
		for (Response res: responses) {
			if (res.getResponse().equals(questions.get(i).getRight_answer())) {
				right++;
			}
			i++;
		}
		return new ResponseEntity<>(right,HttpStatus.OK);
	}
		
		
	
	
}
