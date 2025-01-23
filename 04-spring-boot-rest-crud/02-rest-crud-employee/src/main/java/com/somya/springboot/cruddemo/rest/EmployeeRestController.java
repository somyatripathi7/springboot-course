package com.somya.springboot.cruddemo.rest;

import com.somya.springboot.cruddemo.dao.EmployeeDAO;
import com.somya.springboot.cruddemo.entity.Employee;
import com.somya.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    EmployeeService employeeService;

    @Autowired
    EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    List<Employee> findAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    Employee getEmployee(@PathVariable int id) {
        return employeeService.findById(id);
    }

    @PutMapping("/employees")
    Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
}
