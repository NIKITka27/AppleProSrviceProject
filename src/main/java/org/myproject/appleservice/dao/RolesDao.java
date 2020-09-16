package org.myproject.appleservice.dao;

import org.myproject.appleservice.model.Roles;

import java.util.List;


public interface RolesDao {
	
	List<Roles> findAll();
	
	Roles findByType(String name);
	
	Roles findById(int id);	

}
