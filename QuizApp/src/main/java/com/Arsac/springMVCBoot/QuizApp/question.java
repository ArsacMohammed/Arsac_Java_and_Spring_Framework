package com.Arsac.springMVCBoot.QuizApp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data // this is from lombok which here uses to create getter and seter method.
@Entity
@Table(name="question")
public class question {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="category")
	private String category;
	@Column(name="option1")
	private String option1;
	@Column(name="option2")
	private String option2;
	@Column(name="option3")
	private String option3;
	@Column(name="option4")
	private String option4;
	@Column(name="question_title")
	private String questionTitle;
	@Column(name="right_answer")
	private String rightAnswer;
	@Column(name="difficultylevel")
	private String difficultylevel;
	
}
