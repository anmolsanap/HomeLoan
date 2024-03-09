package com.homeloan.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.eureka.client.service.UserEnquiryService;

@RestController
public class UserEnquiryController {

	@Autowired private UserEnquiryService userEnquiryService;
	
}
