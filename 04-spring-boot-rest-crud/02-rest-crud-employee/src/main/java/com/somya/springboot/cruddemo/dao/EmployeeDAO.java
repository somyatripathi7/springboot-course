package com.somya.springboot.cruddemo.dao;

import com.somya.springboot.cruddemo.entity.Employee;
import com.somya.springboot.cruddemo.service.EmployeeService;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);
}
