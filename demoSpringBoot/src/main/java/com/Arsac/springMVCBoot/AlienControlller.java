package com.Arsac.springMVCBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Arsac.springMVCBoot.model.Alien;
@Controller
public class AlienControlller {
	@Autowired
	AlienRepo repo;
	
	@GetMapping("aliens")
	@ResponseBody  /// this send data rather than sending jsp like in homecontroller (configured as prefix and suffix in the appilication properties.
	public List<Alien> getAliens() {
		List<Alien> aliens= repo.findAll();
		return aliens;   // 
	}
}
/// here the java object are converted into jason files by using inbuilt jackson jar file  in maven dependencies .
// the viceversa is also possible like recoverting the jason file into java object in the server .