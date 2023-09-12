package com.Arsac.questionservice.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Arsac.questionservice.dao.QuestionDao;
import com.Arsac.questionservice.model.Question;
import com.Arsac.questionservice.model.QuestionWrapper;
import com.Arsac.questionservice.model.Response;




@Service
public class QuestionService {
	@Autowired
	QuestionDao questionDao;
	public ResponseEntity<List<Question>> getQuestions() {
		try {
			return new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.OK);
	}
	public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {

		try {
			return new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		
	}
	public ResponseEntity<String>addQuestion(Question question) {
		questionDao.save(question);
		return new ResponseEntity<>("success",HttpStatus.CREATED);
	}
	public ResponseEntity<List<Integer>> getQuestionForQuiz(int numberOfQuestions,String category) {
		List<Integer> questions =questionDao.findRandomQuestionByCategory(category,numberOfQuestions);
		return new ResponseEntity<>(questions,HttpStatus.OK);
	}
	public ResponseEntity<List<QuestionWrapper>> getQuestionById(List<Integer> questionId){
		List<Question> questions=new ArrayList<>();
		List<QuestionWrapper> wrappers =new ArrayList<>();
		for (Integer id : questionId) {
			questions.add(questionDao.findById(id).get());
		}
		for (Question question:questions ) {
			QuestionWrapper wrapper = new QuestionWrapper();
			wrapper.setId(question.getId());
			wrapper.setQuestionTitle(question.getQuestion_title());
			wrapper.setOption1(question.getOption1());
			wrapper.setOption2(question.getOption2());
			wrapper.setOption3(question.getOption3());
			wrapper.setOption4(question.getOption4());
			wrappers.add(wrapper);
		}
		return new ResponseEntity<>(wrappers,HttpStatus.OK);
	}
	
	public ResponseEntity<Integer> calculateScore(List<Response> responses) {
		
		int right=0;
		for (Response res: responses) {
			Question question= questionDao.findById(res.getId()).get();
			if (res.getResponse().equals(question.getRight_answer())) {
				right++;
			}
		}
		return new ResponseEntity<>(right,HttpStatus.OK);
	}

}
