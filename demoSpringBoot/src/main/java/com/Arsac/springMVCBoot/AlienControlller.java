package com.Arsac.springMVCBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Arsac.springMVCBoot.model.Alien;
@RestController
public class AlienControlller {
	@Autowired
	AlienRepo repo;
	
	@GetMapping(path="aliens",produces= {"application/json"})

	public List<Alien> getAliens() {
		List<Alien> aliens= repo.findAll();

		return aliens;   // 
	}
	@GetMapping("alien/{aid}")
	
	public Alien getalienById(@PathVariable("aid") int aid) {
		Alien a = repo.findById(aid).orElse(new Alien(0,"")); 
		return a;
	}
	@PostMapping(path="alien",consumes = {"application/json"}) 
	public Alien addAlien(@RequestBody Alien a) { 
		repo.save(a);
		return a;
	}
}
