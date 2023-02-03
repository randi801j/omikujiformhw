package com.randyluc.Omikujiformhw.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
	
	
	
	@GetMapping ("/omikuji")
	public String form() {
		return "Form.jsp";
	}
	
	@GetMapping("/omikuji/result")
	public String result(HttpSession session, Model model) {
		String result=  (String) session.getAttribute("resultOmikuji");
		model.addAttribute("result",result);
		
		return "result.jsp";
	}
	@PostMapping("/process")
	public String process(
			@RequestParam ("number")int number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("profession") String profession,
			@RequestParam("living") String living,
			@RequestParam("message") String message,
			HttpSession session
			) {
		String resultOmikuji= String.format("In %s years, you will live in %s with %s as  your roomate, %s for a living.The next time you see a %s, you will have good luck. Also, %s" , 
				number, city ,person, profession,living,message);
		System.out.println (number);
		System.out.println (city);
		System.out.println (person);
		
		session.setAttribute("resultOmikuji", resultOmikuji);
		
		return "redirect:/omikuji/result";
	}
	
}
