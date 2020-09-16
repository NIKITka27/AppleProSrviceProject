package org.myproject.appleservice.dao;

import org.myproject.appleservice.model.Employee;

import java.util.List;


public interface EmployeesDao {
	
	Employee findById(int id);
	
	void save(Employee employee);
	
	void deleteById(int id);
	
	List<Employee> findAllEmployee();

}
