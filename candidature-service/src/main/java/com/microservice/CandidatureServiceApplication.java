package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class CandidatureServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidatureServiceApplication.class, args);
	}
}
