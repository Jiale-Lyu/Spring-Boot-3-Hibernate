package com.neu.springboot.cruddemo.dao;

import com.neu.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);
    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
