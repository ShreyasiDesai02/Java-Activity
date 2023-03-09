package com.einfochips.demomvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	@RequestMapping("coffee")
	public String getcoffee() {
		return "latte";
	}
	
	
}
