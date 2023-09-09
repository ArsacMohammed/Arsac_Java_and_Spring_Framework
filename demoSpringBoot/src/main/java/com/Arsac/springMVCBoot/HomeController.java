package com.Arsac.springMVCBoot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arsac.springMVCBoot.model.Alien;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

// in the previous commit we have addded two dependencies like mySQL connector and springBoot data , and no  need to add any other depend' because spring boot will take care of it .

@Controller
public class HomeController {
	@Autowired
	AlienRepo repo;
	@ModelAttribute   
	public void modelName(Model m) {
		m.addAttribute("name","Arsac");
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		/// can view all the funciton by type repo. because repo is declared at the top.
		m.addAttribute("result",repo.findAll());
		return "showAliens";
	}
	@RequestMapping("/")
	public String home() {
		System.out.println("helo");
		return "index";
	}

	@GetMapping("getAlienByAname")
	public String getAlienByAname(Model m,@RequestParam String aname) {
		m.addAttribute("result",repo.findByAname(aname));
		return "showAliens";
	}///work fine
	
	@GetMapping("getAlienByAnameOrderByAname")
	public String getAlienByAnameOrderByAname(Model m,@RequestParam String aname) {
		m.addAttribute("result",repo.findByAnameOrderByAname(aname));
		return "showAliens";
	}
	
	
	@GetMapping("getAlienUsingQuery")
	public String getAlienUsingQuery(Model m,@RequestParam String aname) {
		m.addAttribute("result",repo.find(aname));
		return "showAliens";
	}
	@RequestMapping("addAlien")  

	public String  addAlien(@ModelAttribute("alien") Alien a,Model m) {
		repo.save(a);
		return "result";
		
	}
	
	
	@GetMapping("getAlien")
	public String getAlien(Model m,@RequestParam int aid) {
		/// can view all the funciton by type repo. because repo is declared at the top.
		m.addAttribute("result",repo.findById(aid));
		return "showAliens";
	}
	
	//  getting alien by name by not using using inbuilt functino of jpa repo. rather by using querydsl.

	
}


