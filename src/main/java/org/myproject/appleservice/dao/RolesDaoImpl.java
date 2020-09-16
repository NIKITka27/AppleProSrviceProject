package org.myproject.appleservice.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.myproject.appleservice.model.Roles;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("rolesDao")
public class RolesDaoImpl extends AbstractDao<Integer, Roles> implements RolesDao{

	@Override
	public List<Roles> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.addOrder(Order.asc("name"));
		return (List<Roles>)criteria.list();

	}

	@Override
	public Roles findByType(String name) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("name", name));
		return (Roles) criteria.uniqueResult();
	}

	@Override
	public Roles findById(int id) {

		return getByKey(id);
	}

}
