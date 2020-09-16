package org.myproject.appleservice.dao;

import org.myproject.appleservice.model.Device;

import java.util.List;


public interface DeviceDao {

	
	Device findById(int id);
	
	void save(Device device);
	
	void deleteById(int id);
	
	List<Device> findAllDevice();
}
