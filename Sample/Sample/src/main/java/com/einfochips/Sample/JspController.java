package com.einfochips.Sample;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class JspController {
	@RequestMapping("index")
	public String firstpage() {
		return "index.jsp";
	}
	
//	@RequestMapping("adddata")
//	public String Register(HttpServletRequest req) {
//		System.out.println(req.getParameter("uname"));
//		System.out.println(req.getParameter("email"));
//
//		return req.getParameter("uname");
//	}
	
	@RequestMapping("adddata")
	public ModelAndView addRegister(HttpServletRequest req) {
		ModelAndView mv =new ModelAndView("success.jsp");
			String name =req.getParameter("uname");
		if(name.length()>=1) {
			mv.addObject("value", name);
		}
		else {
			mv.addObject("value", "You have entered less than 1");
		}
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView addlogin() {
		return new ModelAndView("login.jsp");
	}
}
