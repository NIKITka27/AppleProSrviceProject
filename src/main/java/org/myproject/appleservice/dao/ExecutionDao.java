package org.myproject.appleservice.dao;

import org.myproject.appleservice.model.Execution;

import java.util.List;


public interface ExecutionDao {
	
	Execution findById(int id);
	
	void save(Execution execution);
	
	void deleteById(int id);
	
	List<Execution> findAllExecution();

}
