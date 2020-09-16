package org.myproject.appleservice.Repository;

import org.myproject.appleservice.model.OrderStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends CrudRepository<OrderStatus, Long> {
    List<OrderStatus> findAll();
    OrderStatus findByName(String name);
}
