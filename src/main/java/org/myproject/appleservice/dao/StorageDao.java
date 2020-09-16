package org.myproject.appleservice.dao;

import org.myproject.appleservice.model.StorageComponents;

import java.util.List;


public interface StorageDao {

	StorageComponents findById(int id);
	
	void save(StorageComponents storageComponents);
	
	void deleteById(int id);
	
	List<StorageComponents> findAllStorage();


}
