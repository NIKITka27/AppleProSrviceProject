package org.myproject.appleservice.service;

import org.myproject.appleservice.Repository.EmployeeRepository;
import org.myproject.appleservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("EmployeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired(required=false)
    private EmployeeRepository employeeRepository;

    @Override
    public Optional findById(int id) {
        return employeeRepository.findById((long) id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
    
    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById((long) id);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

}
