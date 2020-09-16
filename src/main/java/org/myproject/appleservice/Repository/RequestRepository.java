package org.myproject.appleservice.Repository;

import org.myproject.appleservice.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
    List<Request> findAll();
}
