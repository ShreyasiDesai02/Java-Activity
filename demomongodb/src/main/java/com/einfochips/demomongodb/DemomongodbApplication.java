package com.einfochips.demomongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class DemomongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomongodbApplication.class, args);
	}

}
