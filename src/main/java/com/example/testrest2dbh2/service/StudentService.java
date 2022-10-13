package com.example.testrest2dbh2.service;

import com.example.testrest2dbh2.entity.Student;

import javax.transaction.Transactional;
import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    @Transactional
    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
