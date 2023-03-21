package com.einfo.demotesting.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("home")
	public String gethome() {
		return "Home Page";
	}
	
	@RequestMapping("index")
	public String getindex() {
		return "hi";
	}

	

}
