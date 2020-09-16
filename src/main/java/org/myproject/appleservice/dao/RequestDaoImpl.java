package org.myproject.appleservice.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.myproject.appleservice.model.Request;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("requestDao")
public class RequestDaoImpl extends AbstractDao<Integer, Request> implements RequestDao{

	@Override
	public Request findById(int id) {
		Request request = getByKey(id);
		return null;
	}

	@Override
	public void save(Request request) {
		persist(request);
		
	}

	@Override
	public void deleteById(int id) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("id", id));
		Request request = (Request) criteria.uniqueResult();
		delete(request);
		
	}

	@Override
	public List<Request> findAllRequest() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Request> requests = (List<Request>) criteria.list();
		return requests;
	}
	
}
