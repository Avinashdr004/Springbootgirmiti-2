package com.girmiti.generalstore.customer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.girmiti.generalstore.customer.entity.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
public List<Customer> findByCname(String cname);

}
