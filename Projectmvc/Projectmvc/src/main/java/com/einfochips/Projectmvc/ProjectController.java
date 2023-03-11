package com.einfochips.Projectmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.Projectmvc.jdbc.Userjdbc;
import com.einfochips.Projectmvc.model.User;

@RestController
public class ProjectController {
	
	@Autowired //dependy injection for spring mvc
	Userjdbc uj;
	
	@RequestMapping("Home")
	public ModelAndView gethome()
	{
		return new ModelAndView("home");
	}
	
	@RequestMapping("register")
	public ModelAndView getregister() {
		return new ModelAndView("reg");
	}
	
	@RequestMapping("checkuser")
	public ModelAndView getcheckuser(@RequestParam("uname") String name) {
		System.out.println(name);
		return new ModelAndView("success");
	}
	
	@RequestMapping(value ="finduser", method = RequestMethod.POST)
	public ModelAndView getfinduser(@RequestParam("uname") String name) {
		System.out.println(name);
		List<User> u =uj.getAllUsers();
		System.out.println(u);
		return new ModelAndView("success");
	}
	
	
}
