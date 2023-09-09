package com.Arsac.springMVCBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Arsac.springMVCBoot.model.Alien;
@RestController
public class AlienControlller {
	@Autowired
	AlienRepo repo;
	
	@GetMapping(path="aliens",produces= {"application/xml"})// restrict the access  to only xml 

	public List<Alien> getAliens() {
		List<Alien> aliens= repo.findAll();
		return aliens;   // 
	}
	@GetMapping("alien/{aid}")
	
	public Alien getalienById(@PathVariable("aid") int aid) {
		Alien a = repo.findById(aid).orElse(new Alien(0,"")); // orElse is present to ensure  if the id is not present in the database we will return (0,");
		return a;
	}
	@PostMapping("alien")
	public Alien addAlien(Alien a) {
		repo.save(a);
		return a;
	}
}
