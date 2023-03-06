package com.girmiti.generalstore.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.girmiti.generalstore.customer.entity.Customer;
@Service
public interface RetrieveByName {
public List<Customer> retriveByName(String cname);
}
