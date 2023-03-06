package com.girmiti.generalstore.customer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.generalstore.customer.entity.Customer;
import com.girmiti.generalstore.customer.repo.CustomerRepo;
import com.girmiti.generalstore.customer.service.RetrieveByName;
@Service
public class RetrieveByNameImp  implements RetrieveByName{
@Autowired
private CustomerRepo customerRepo;
	@Override
	public List<Customer> retriveByName(String cname) {
      List<Customer> c2=customerRepo.findByCname(cname);
      return c2;
	}

}
