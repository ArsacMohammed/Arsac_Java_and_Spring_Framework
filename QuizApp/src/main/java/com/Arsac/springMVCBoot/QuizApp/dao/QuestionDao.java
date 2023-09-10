package com.Arsac.springMVCBoot.QuizApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arsac.springMVCBoot.QuizApp.question;
@Repository
public interface QuestionDao extends JpaRepository<question,Integer>{
	
}
