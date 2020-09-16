package org.myproject.appleservice.dao;

import org.myproject.appleservice.model.Customer;

import java.util.List;


public interface CustomerDao {
	
	Customer findById(int id);
	
	void save(Customer customer);
	
	void deleteById(int id);
	
	List<Customer> findAllCustomer();

}
