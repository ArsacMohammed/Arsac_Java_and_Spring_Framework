package com.Arsac.springMVCBoot.QuizApp.Controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Quizdao extends JpaRepository<Quiz, Integer> {
	

}
