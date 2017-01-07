package com.chio.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ChioUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChioUserApplication.class, args);
	}
}
