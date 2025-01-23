package com.somya.springboot.cruddemo.dao;

import com.somya.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private EntityManager entityManager;

    EmployeeDAOImpl(EntityManager  entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        // execute query and get result list
        return theQuery.getResultList();
    }


    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }


    @Override
    public Employee save(Employee employee) {
        Employee oldEmployee = entityManager.find(Employee.class, employee.getId());
        oldEmployee = employee;
        entityManager.merge(oldEmployee);
        return oldEmployee;
    }
}
