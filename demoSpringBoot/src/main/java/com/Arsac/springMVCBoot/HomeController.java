package com.Arsac.springMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller
public class HomeController {
	@RequestMapping("/")

	public String home() {
		System.out.println("helo");
		return "index.jsp";
	}
	//refactoring the method
	
	//since the value are passed via url it gets the param from the url
	@RequestMapping("add")
	public String add (@RequestParam("num1") int i,@RequestParam("num2") int j,HttpSession session) {
		int num3=i+j;
		session.setAttribute("num3",num3);
		return "result.jsp";
	}
}


