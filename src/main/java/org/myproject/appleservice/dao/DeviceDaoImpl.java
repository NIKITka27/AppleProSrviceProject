package org.myproject.appleservice.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.myproject.appleservice.model.Device;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("devicesDao")
public class DeviceDaoImpl extends AbstractDao<Integer, Device> implements DeviceDao{

	@Override
	public Device findById(int id) {
		Device device = getByKey(id);

		return device;
	}

	@Override
	public void save(Device device) {
		persist(device);
		
	}

	@Override
	public void deleteById(int id) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("id", id));
		Device device = (Device) criteria.uniqueResult();
		delete(device);
		
	}

	@Override
	public List<Device> findAllDevice() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Device> devices = (List<Device>) criteria.list();
		return devices;
	}

}
