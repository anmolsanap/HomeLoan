package com.homeloan.eureka.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.eureka.client.model.UserEnquiry;

@Repository
public interface UserEnquiryRepository extends JpaRepository<UserEnquiry, Integer>{

}
