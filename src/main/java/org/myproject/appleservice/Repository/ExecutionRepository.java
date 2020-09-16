package org.myproject.appleservice.Repository;

import org.myproject.appleservice.model.Execution;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExecutionRepository extends CrudRepository<Execution, Long> {
    List<Execution> findAll();
}
