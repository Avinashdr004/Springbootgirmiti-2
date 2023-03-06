package com.girmiti.generalstore.customer.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.generalstore.customer.entity.Customer;
import com.girmiti.generalstore.customer.repo.CustomerRepo;
import com.girmiti.generalstore.customer.service.RetrieveById;
@Service
public class RetrieveByIdImpl implements RetrieveById{

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public Optional<Customer> retrieveById(int id) {
		Optional<Customer> c1=customerRepo.findById(id);
		return c1;
	}

}
