package com.einfochips.Sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//annotation: avoid xml configuration
@RestController
public class Homecontroller2 {
	@RequestMapping("Shreyasi") //takes to particular page;request defined
	public String getShreyasi() {
		return "Shreyasi";
		
	}
	@RequestMapping("desai")
	public String getshreyasi() {
		return "hello world";
	}

}
