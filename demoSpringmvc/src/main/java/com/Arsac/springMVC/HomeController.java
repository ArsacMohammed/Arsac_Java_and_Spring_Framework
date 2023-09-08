package com.Arsac.springMVC;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arsac.springMVC.dao.AlienDao;
import com.Arsac.springMVC.model.Alien;



@Controller
public class HomeController {
	
	@Autowired
	private AlienDao dao;
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		m.addAttribute("result",dao.getAliens());
		return "showAliens";
	}
	
	@RequestMapping("/")
	public String home() {
		System.out.println("helo");
		return "index";
	}
	@RequestMapping("addAlien")
	 public String addAlien(@ModelAttribute("result") Alien a) {
		dao.addAlien(a);
		return "showAliens";
	}
	@RequestMapping("getAlien")
	public String getAlien(@RequestParam int aid,Model m) {
		m.addAttribute("result",dao.getAlien(aid));
		return "showAliens";
	}
	
}


