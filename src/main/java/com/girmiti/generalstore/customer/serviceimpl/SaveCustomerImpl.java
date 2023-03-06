package com.girmiti.generalstore.customer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.generalstore.customer.entity.Customer;
import com.girmiti.generalstore.customer.repo.CustomerRepo;
import com.girmiti.generalstore.customer.service.SaveCustomer;
@Service
public class SaveCustomerImpl implements SaveCustomer{
@Autowired
 private CustomerRepo customerRepo;

	@Override
	public Customer saveDetails(Customer c) {
		Customer customer=customerRepo.save(c);
		return c;
		
	}

}
