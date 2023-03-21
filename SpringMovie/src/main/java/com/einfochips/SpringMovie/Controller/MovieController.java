package com.einfochips.SpringMovie.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MovieController {
	@RequestMapping("Home")
	public ModelAndView gethome() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("Booking")
	public ModelAndView getBooking()
	{
		return new ModelAndView("Booking");
	}
	
	@RequestMapping("checker")
	public ModelAndView getcheck() {
		return new ModelAndView("success");
	}
}
