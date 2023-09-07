package com.Arsac.springMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller
public class HomeController {
	@RequestMapping("/")

	public String home() {
		System.out.println("helo");
		return "index";
	}
// if we dont want to use ModelAndView , we can use Model (which create simple object or ModelMap (for Storing like a map).
	@RequestMapping("add")
	public String add (@RequestParam("num1") int i,@RequestParam("num2") int j,Model m){
		int num3=i+j;

//		ModelAndView mv = new ModelAndView("result");  // this also works
//		mv.addObject("num3",num3);
//	    mv.setViewName("result"); 
		m.addAttribute("num3",num3);
		return "result";
	}
	
}


