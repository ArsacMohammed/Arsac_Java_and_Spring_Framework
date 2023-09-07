package com.Arsac.springMVCBoot;

import org.springframework.stereotype.Controller;
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
		return "index.jsp";
	}
//to remove httpsession we can use ModelAndView class.
	@RequestMapping("add")
	public ModelAndView add (@RequestParam("num1") int i,@RequestParam("num2") int j) {
		int num3=i+j;
		ModelAndView mv = new ModelAndView();
		mv.addObject("num3",num3);
	    mv.setViewName("result.jsp"); // give the name of the jsp file  where we print the view .
		return mv;
	}
}


