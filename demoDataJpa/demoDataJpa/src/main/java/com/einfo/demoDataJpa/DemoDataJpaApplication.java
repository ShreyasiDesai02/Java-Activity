package com.einfo.demoDataJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDataJpaApplication.class, args);
		System.out.println("Started Server");
	}

}
