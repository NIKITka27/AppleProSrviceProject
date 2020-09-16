package org.myproject.appleservice.service;

import org.myproject.appleservice.dao.CustomerDaoImpl;
import org.myproject.appleservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("CustomerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDaoImpl customerDao;


	@Override
	public Customer findById(Long id) {
		return customerDao.findById(Math.toIntExact(id));
	}

	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
		
	}

	@Override
	public void deleteById(int id) {
		customerDao.deleteById(id);
		
	}

	@Override
	public List<Customer> findAllCustomer() {
		return customerDao.findAllCustomer();
	}



}
