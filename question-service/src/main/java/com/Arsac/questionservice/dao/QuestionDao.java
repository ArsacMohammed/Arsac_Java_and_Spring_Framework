package com.Arsac.questionservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Arsac.questionservice.model.Question;



public interface QuestionDao extends JpaRepository<Question,Integer>{

	List<Question> findByCategory(String category);
	@Query(value="SELECT * FROM question q WHERE q.category = :category ORDER BY RAND() LIMIT :numQ\r\n" ,nativeQuery=true)
	List<Question> findRandomQuestionByCategory(String category,int numQ);
	
}
