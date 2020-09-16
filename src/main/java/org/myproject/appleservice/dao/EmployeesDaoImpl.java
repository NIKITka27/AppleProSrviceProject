package org.myproject.appleservice.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.myproject.appleservice.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("employeeDao")
public class EmployeesDaoImpl extends AbstractDao<Integer, Employee> implements EmployeesDao {

	@Override
	public Employee findById(int id) {
		Employee employee = getByKey(id);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		persist(employee);
		
	}

	@Override
	public void deleteById(int id) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("id", id));
		Employee employee = (Employee) criteria.uniqueResult();
		delete(employee);
		
	}

	@Override
	public List<Employee> findAllEmployee() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Employee> employee = (List<Employee>) criteria.list();
		return employee;
	}

}
