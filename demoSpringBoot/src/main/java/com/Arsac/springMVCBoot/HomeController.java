package com.Arsac.springMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    
	
	@RequestMapping("addAlien")
//	public String  addAlien(@ModelAttribute Alien alien,Model m) {  or we can do like the below
	public String  addAlien(@ModelAttribute("alien") Alien a,Model m) {
//		m.addAttribute("alien",a);(dont want this line ) because // @ModelAttribite is responsible to add data to the model when client gives inputin the form
// we have to mention 'alien' somewhere that why we add alien near the model attribute
		return "result";
		
	}
	
}


