package com.girmiti.generalstore.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.girmiti.generalstore.customer.entity.Customer;
import com.girmiti.generalstore.customer.service.DeleteCustomer;
import com.girmiti.generalstore.customer.service.RetrieveById;
import com.girmiti.generalstore.customer.service.RetrieveByName;
import com.girmiti.generalstore.customer.service.SaveCustomer;
import com.girmiti.generalstore.customer.service.UpdateCustomer;
import com.girmiti.generalstore.customer.serviceimpl.updateCustomerImpl;


@RestController
public class CustomerController {
	
	@Autowired
	private SaveCustomer saveCustomer;
@RequestMapping("/save")	
public Customer create(@RequestBody Customer c) {
	return saveCustomer.saveDetails(c);
	
}


@Autowired
private RetrieveById retrieve;
@RequestMapping("/retrieve")
public Optional<Customer> readId(@RequestParam int id ) {
	return retrieve.retrieveById(id);
}
@Autowired
private RetrieveByName byName;
@RequestMapping("/retrievebyname")
 public List<Customer> readByName(@RequestParam String cname) {
	 return byName.retriveByName(cname);
 }

@Autowired
private DeleteCustomer deleteCustomer;
@RequestMapping("/delete")
public String erasedetails(@RequestParam int id) {
	return deleteCustomer.eraseCustomer(id);
}
@Autowired
private UpdateCustomer customer;
@RequestMapping("/update")
public Customer upgrade (@RequestParam int id) {
	return customer.updateCustomer(id);
}
}
