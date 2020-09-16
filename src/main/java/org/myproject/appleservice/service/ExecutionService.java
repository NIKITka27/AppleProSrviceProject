package org.myproject.appleservice.service;


import org.myproject.appleservice.model.Execution;

import java.util.List;
import java.util.Optional;

public interface ExecutionService {

    Optional findById(int id);

    void save(Execution execution);

    void deleteById(int id);

    List<Execution> findAllExecution();
}
