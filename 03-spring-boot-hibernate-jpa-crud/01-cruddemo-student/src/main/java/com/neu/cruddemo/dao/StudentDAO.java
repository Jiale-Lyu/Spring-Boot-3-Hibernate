package com.neu.cruddemo.dao;

import com.neu.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
}
