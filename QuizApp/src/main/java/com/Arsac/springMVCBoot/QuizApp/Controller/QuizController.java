package com.Arsac.springMVCBoot.QuizApp.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
public class QuizController {
	@PostMapping("create")
	public ResponseEntity<String> quiz (@RequestParam String category,@RequestParam int numQ,@RequestParam String title) {
		return new ResponseEntity<>("Im here",HttpStatus.OK);
	}
	
}
