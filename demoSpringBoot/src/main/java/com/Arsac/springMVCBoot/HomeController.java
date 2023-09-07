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
	@RequestMapping("add")
	public String add (@RequestParam("num1") int i,@RequestParam("num2") int j,Model m){
		int num3=i+j;

//		ModelAndView mv = new ModelAndView("result");  // this also works
//		mv.addObject("num3",num3);
//	    mv.setViewName("result"); //no need
		m.addAttribute("num3",num3);
		return "result";
	}
//	@RequestMapping("addAlien")
//	public String  addAlien(@RequestParam("aid") int aid,@RequestParam("aname") String aname,Model m) {
//		Alien a = new Alien();
//		a.setId(aid);
//		a.setAname(aname);
//		m.addAttribute("alien",a); //  will show hash code thatswhy toString is override in alien class
//		return "result";
//		
//	}
	
	@RequestMapping("addAlien")
	public String  addAlien(Alien a,Model m) {
//		Alien a = new Alien();
//		a.setId(aid);
//		a.setAname(aname);    // spring boot framework will automatically do this for us.
		m.addAttribute("alien",a); //  will show hash code thatswhy toString is override in alien class
		return "result";
		
	}
	
}


