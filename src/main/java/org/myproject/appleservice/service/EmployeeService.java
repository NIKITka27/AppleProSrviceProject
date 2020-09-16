package org.myproject.appleservice.service;

import org.myproject.appleservice.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Optional findById(int id);

    void save(Employee employee);

    void deleteById(int id);

    List<Employee> findAllEmployee();
}
