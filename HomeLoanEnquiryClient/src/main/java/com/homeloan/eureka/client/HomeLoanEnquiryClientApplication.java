package com.homeloan.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HomeLoanEnquiryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanEnquiryClientApplication.class, args);
	}

}
