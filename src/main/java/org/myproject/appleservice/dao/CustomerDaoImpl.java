package org.myproject.appleservice.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.myproject.appleservice.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("customerDao")
public class CustomerDaoImpl extends AbstractDao<Integer, Customer> implements CustomerDao{

	@Override
	public Customer findById(int id) {

		return getByKey(id);
	}

	@Override
	public void save(Customer customer) {
		persist(customer);
	}

	@Override
	public void deleteById(int id) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("id", id));
		Customer customer = (Customer) crit.uniqueResult();
		delete(customer);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findAllCustomer() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		return (List<Customer>) criteria.list();
	}

}
