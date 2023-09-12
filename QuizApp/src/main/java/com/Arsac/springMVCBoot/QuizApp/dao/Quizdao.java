package com.Arsac.springMVCBoot.QuizApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arsac.springMVCBoot.QuizApp.model.Quiz;

public interface Quizdao extends JpaRepository<Quiz, Integer> {
	

}
