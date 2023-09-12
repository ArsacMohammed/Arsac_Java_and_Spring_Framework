package com.Arsac.quizservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arsac.quizservice.model.Quiz;



public interface Quizdao extends JpaRepository<Quiz, Integer> {
	

}
