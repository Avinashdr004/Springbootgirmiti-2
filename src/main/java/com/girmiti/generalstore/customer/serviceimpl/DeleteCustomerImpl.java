package com.girmiti.generalstore.customer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.generalstore.customer.repo.CustomerRepo;
import com.girmiti.generalstore.customer.service.DeleteCustomer;
@Service
public class DeleteCustomerImpl implements DeleteCustomer{
@Autowired
private CustomerRepo customerRepo;

	@Override
	public String eraseCustomer(int id) {
	customerRepo.deleteById(id);
	return "deleted successfully";
	}

}
