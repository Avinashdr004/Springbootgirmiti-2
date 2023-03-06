package com.girmiti.generalstore.customer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.generalstore.customer.entity.Customer;
import com.girmiti.generalstore.customer.repo.CustomerRepo;
import com.girmiti.generalstore.customer.service.UpdateCustomer;
@Service
public class updateCustomerImpl  implements UpdateCustomer{
@Autowired
private CustomerRepo customerRepo;
	@Override
	public Customer updateCustomer(int id) {
    		
		Customer c4=customerRepo.getById(id);
		c4.setCmob(56665945);
		return customerRepo.save(c4);
		
	}

}
