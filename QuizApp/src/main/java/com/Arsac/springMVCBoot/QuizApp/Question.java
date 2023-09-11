package com.Arsac.springMVCBoot.QuizApp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
 // this is from lombok which here uses to create getter and seter method.
@Entity
@Table(name="question")
public class Question {
	@Id
	int id;
	String category;
	String option1;
	String option2;
	String option3;
	String option4;
	String questionTitle;/// camel casing is very important and if you have space in between column name in databse use camelcasing here 
	String rightAnswer;
	String difficultylevel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getQuestion_title() {
		return questionTitle;
	}
	public void setQuestion_title(String question_title) {
		this.questionTitle = question_title;
	}
	public String getRight_answer() {
		return rightAnswer;
	}
	public void setRight_answer(String right_answer) {
		this.rightAnswer = right_answer;
	}
	public String getDifficultylevel() {
		return difficultylevel;
	}
	public void setDifficultylevel(String difficultylevel) {
		this.difficultylevel = difficultylevel;
	}
	
	
}
