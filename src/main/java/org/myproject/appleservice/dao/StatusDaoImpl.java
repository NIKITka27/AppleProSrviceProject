package org.myproject.appleservice.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.myproject.appleservice.model.OrderStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("statusDao")
public class StatusDaoImpl extends AbstractDao<Integer, OrderStatus> implements StatusDao {

	@Override
	public List<OrderStatus> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.addOrder(Order.asc("name"));
		return (List<OrderStatus>)criteria.list();
	}

	@Override
	public OrderStatus findByType(String name) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("name", name));
		return (OrderStatus) criteria.uniqueResult();
	}

	@Override
	public OrderStatus findById(int id) {

		return getByKey(id);
	}

}
