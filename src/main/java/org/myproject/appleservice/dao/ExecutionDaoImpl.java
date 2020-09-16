package org.myproject.appleservice.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.myproject.appleservice.model.Execution;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("executionDao")
public class ExecutionDaoImpl extends AbstractDao<Integer, Execution> implements ExecutionDao {

	@Override
	public Execution findById(int id) {
		Execution execution = getByKey(id);
		return execution;
	}

	@Override
	public void save(Execution execution) {
		persist(execution);
		
	}

	@Override
	public void deleteById(int id) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("id", id));
		Execution execution = (Execution) criteria.uniqueResult();
		delete(execution);
		
	}

	@Override
	public List<Execution> findAllExecution() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Execution> executions = (List<Execution>) criteria.list();
		return executions;
	}

}
