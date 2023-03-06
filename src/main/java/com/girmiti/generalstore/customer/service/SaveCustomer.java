package com.girmiti.generalstore.customer.service;

import org.springframework.stereotype.Service;

import com.girmiti.generalstore.customer.entity.Customer;
@Service
public interface SaveCustomer {
	
 public Customer saveDetails(Customer c);
 
}
