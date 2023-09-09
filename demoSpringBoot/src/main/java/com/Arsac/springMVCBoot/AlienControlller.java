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
	@PostMapping("alien")
	public Alien addAlien(Alien a) {
		repo.save(a);
		return a;
	}
}
// content negotiation mean the data file could in jason or xml format , jackson  jason is inbuilt as jar in maven , we have to add jackson datasource xml  dependencies in pom file
//after adding it ,it will show error related to url so configure the application properties with
//spring.jackson.serialization.WRITE_DATES_AS_TIMESTAMPS=false
//spring.jackson.dataformat.xml.default_useWrapper=false

// make sure in header in postman you enter Accept in key and application/xml in the value and press enter in get 