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
		return "index";
	}
// for security reasons , the two jsp files are moved to views file and application properties is added to config it
// prefix and suffix is added for files to be found 
// for applicaiton properties visit-https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#application-properties.web.spring.mvc.view.prefix
	@RequestMapping("add")
	public ModelAndView add (@RequestParam("num1") int i,@RequestParam("num2") int j) {
		int num3=i+j;
		ModelAndView mv = new ModelAndView();
		mv.addObject("num3",num3);
	    mv.setViewName("result"); // give the name of the jsp file  where we print the view .
		return mv;
	}
}


