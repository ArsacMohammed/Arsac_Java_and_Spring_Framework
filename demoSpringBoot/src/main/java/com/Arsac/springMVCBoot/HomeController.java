package com.Arsac.springMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@RequestMapping("add")
	public String add (HttpServletRequest req) {
		int i= Integer.parseInt(req.getParameter("number"));
		int j= Integer.parseInt(req.getParameter("number2"));
		int num3=i+j;
		HttpSession session = req.getSession(); 
		session.setAttribute("num3",num3);
		return "result.jsp";
	}
}

/// here we display the form by index.jsp
//after the form is filled by action keyword it calls the add method in the homecontroller
//where addition is done and redirected to the result page that is result.jsp
