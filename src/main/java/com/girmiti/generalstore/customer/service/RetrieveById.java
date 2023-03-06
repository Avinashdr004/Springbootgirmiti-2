package com.girmiti.generalstore.customer.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.girmiti.generalstore.customer.entity.Customer;
@Service
public interface RetrieveById {
	
public Optional<Customer> retrieveById(int id);
}
