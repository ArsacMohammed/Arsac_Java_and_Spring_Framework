package com.Arsac.springMVCBoot.QuizApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Arsac.springMVCBoot.QuizApp.Question;
import com.Arsac.springMVCBoot.QuizApp.dao.QuestionDao;

@Service
public class QuestionService {
	@Autowired
	QuestionDao questionDao;
	public List<Question> getQuestions() {
		return questionDao.findAll();
	}

}
