package com.Arsac.springMVCBoot.Secureapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
}

//just by adding spring boot starter security depenency ,you can get login page nothing else.