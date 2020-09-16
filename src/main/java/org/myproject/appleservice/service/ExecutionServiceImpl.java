package org.myproject.appleservice.service;

import org.myproject.appleservice.Repository.ExecutionRepository;
import org.myproject.appleservice.model.Execution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("ExecutionService")
@Transactional
public class ExecutionServiceImpl implements ExecutionService{
    @Autowired(required=false)
    private ExecutionRepository executionRepository;

    @Override
    public Optional findById(int id) {
        return executionRepository.findById((long) id);
    }

    @Override
    public void save(Execution execution) {
        executionRepository.save(execution);
    }

    @Override
    public void deleteById(int id) {
        executionRepository.deleteById((long) id);
    }

    @Override
    public List<Execution> findAllExecution() {
        return executionRepository.findAll();
    }
}
