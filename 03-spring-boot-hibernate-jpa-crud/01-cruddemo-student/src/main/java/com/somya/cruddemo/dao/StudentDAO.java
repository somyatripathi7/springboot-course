package com.somya.cruddemo.dao;

import com.somya.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(int id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update (Student student);

    void delete(Integer id);

    int deleteAll();
}
