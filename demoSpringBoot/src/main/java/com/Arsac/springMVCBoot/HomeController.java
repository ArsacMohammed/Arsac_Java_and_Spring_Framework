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
    
	// post method doesnot send data via url and get method does 
	// to note use post when sending data to the server and use get when fetching data from the server.
	@RequestMapping("addAlien")  // this work for both post and get method type 
	//you can also do
	//@PostMapping("addAlien")   or @RequestMapping("addAlien",method=RequestMethod.POST)
	//@GetMapping("addAlien")   or @RequestMapping("addAlien",method=RequestMethod.GET)
	public String  addAlien(@ModelAttribute("alien") Alien a,Model m) {

		return "result";
		
	}
	
}


