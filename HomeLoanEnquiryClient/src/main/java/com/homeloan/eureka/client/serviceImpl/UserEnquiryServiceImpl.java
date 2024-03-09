package com.homeloan.eureka.client.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.eureka.client.UserEnquiryRepository;
import com.homeloan.eureka.client.service.UserEnquiryService;

@Service
public class UserEnquiryServiceImpl implements UserEnquiryService{

	@Autowired private UserEnquiryRepository enquiryRepository;
}
