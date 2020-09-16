package org.myproject.appleservice.dao;

import org.myproject.appleservice.model.OrderStatus;

import java.util.List;

public interface StatusDao {
	
	List<OrderStatus> findAll();
	
	OrderStatus findByType(String name);
	
	OrderStatus findById(int id);	

}
