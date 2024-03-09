package com.homeloan.eureka.client.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class UserEnquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enquiryUserId;
	private String enquiryUserFullName, address, gender, panCard;
	private long mobileNo, adharCard;
	
	
	
}
