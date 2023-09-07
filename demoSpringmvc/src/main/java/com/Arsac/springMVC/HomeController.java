package com.Arsac.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller
public class HomeController {
	
	@ModelAttribute   // you can also do this in addAlien method but doing here assign before executing the other method
	public void modelName(Model m) {
		m.addAttribute("name","Arsac");
	}
	@RequestMapping("/")

	public String home() {
		System.out.println("helo");
		return "index";
	}
	@RequestMapping("add")
	public String add (@RequestParam("num1") int i,@RequestParam("num2") int j,Model m){
		int num3=i+j;

//		ModelAndView mv = new ModelAndView("result");  // this also works
//		mv.addObject("num3",num3);
//	    mv.setViewName("result"); //no need
		m.addAttribute("num3",num3);
		return "result";
	}
    
	
	@RequestMapping("addAlien")
	public String  addAlien(@ModelAttribute("alien") Alien a,Model m) {

		return "result";
		
	}
	
}

