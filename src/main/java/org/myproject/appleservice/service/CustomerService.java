package org.myproject.appleservice.service;



import org.myproject.appleservice.model.Customer;

import java.util.List;

public interface CustomerService  {

	Customer findById(Long id);
	
	void save(Customer customer);
	
	void deleteById(int id);
	
	List<Customer> findAllCustomer();

}
