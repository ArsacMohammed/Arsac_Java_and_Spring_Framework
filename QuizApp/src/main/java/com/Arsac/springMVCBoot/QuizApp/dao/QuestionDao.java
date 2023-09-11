package com.Arsac.springMVCBoot.QuizApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arsac.springMVCBoot.QuizApp.Question;

public interface QuestionDao extends JpaRepository<Question,Integer>{

	List<Question> findByCategory(String category);
	
}
