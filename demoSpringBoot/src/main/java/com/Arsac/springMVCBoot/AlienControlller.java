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
	
	@GetMapping("aliens")
	 /// this send data rather than sending jsp like in homecontroller (configured as prefix and suffix in the appilication properties.
	public List<Alien> getAliens() {
		List<Alien> aliens= repo.findAll();
		return aliens;   // 
	}
	@GetMapping("alien/{aid}")
	
	public Alien getalienById(@PathVariable("aid") int aid) {
		Alien a = repo.findById(aid).orElse(new Alien(0,"")); // orElse is present to ensure  if the id is not present in the database we will return (0,");
		return a;
	}
	@PostMapping("alien")// note get is to fetch the information from the server and post is to send the information to the server.
	public Alien addAlien(Alien a) {
		repo.save(a);
		return a;
	}// instead of using forms to get the input , we use postname change the option to post ,in the param area ,enter the key value as aid or aname and in the value area enter the respective values.
}
/// since  we using @ responsebody for each method for converting, we can change the @Controller to @RestController and remove @Response body above each method that is responsible for converting