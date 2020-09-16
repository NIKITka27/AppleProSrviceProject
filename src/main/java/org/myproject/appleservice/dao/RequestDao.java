package org.myproject.appleservice.dao;

import org.myproject.appleservice.model.Request;

import java.util.List;


public interface RequestDao {
	Request findById(int id);
	
	void save(Request request);
	
	void deleteById(int id);
	
	List<Request> findAllRequest();


}
