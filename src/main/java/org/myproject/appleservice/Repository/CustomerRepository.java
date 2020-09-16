package org.myproject.appleservice.Repository;

import org.myproject.appleservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository  extends CrudRepository<Customer, Long> {
    List<Customer> findAll();
    Customer findByEmail(final String email);

}
