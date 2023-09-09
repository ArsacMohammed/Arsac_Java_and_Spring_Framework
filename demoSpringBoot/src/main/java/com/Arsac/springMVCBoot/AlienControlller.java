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
	
	@GetMapping(path="aliens",produces= {"application/json"})// restrict the access  to only xml
	//and have to mention at the header part  in postman as Accept in key and application-xml or application/json based on requirement    .... basically it returns the file from  the server as respective format.

	public List<Alien> getAliens() {
		List<Alien> aliens= repo.findAll();
		return aliens;   // 
	}
	@GetMapping("alien/{aid}")
	
	public Alien getalienById(@PathVariable("aid") int aid) {
		Alien a = repo.findById(aid).orElse(new Alien(0,"")); // orElse is present to ensure  if the id is not present in the database we will return (0,");
		return a;
	}
	@PostMapping(path="alien",consumes = {"application/json"})  // consumes restrict the input as json and have to mention that in header part as ContentType as application/json and write the code as 
//	{
//    "aid": 110,
//    "aname": "Aasha"
//} as this in raw part of the body in postman  --- consumes basically produce the data as respective format based on the data file type 

	public Alien addAlien(@RequestBody Alien a) {  /// @ Request body convert the json into java object where the @ReponseBody convert the java object to json or xml to the server.  --- 
		repo.save(a);
		return a;
	}
}
