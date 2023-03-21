package com.einfo.demotesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemotestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemotestingApplication.class, args);
		System.out.println("Started server");
	}

}
