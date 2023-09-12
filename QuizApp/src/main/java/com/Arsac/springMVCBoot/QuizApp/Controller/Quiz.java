package com.Arsac.springMVCBoot.QuizApp.Controller;

import java.util.List;

import com.Arsac.springMVCBoot.QuizApp.Question;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Quiz {
	@Id
	private int id;
	private String title;
	@ManyToMany
	private List<Question> questions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	
}
