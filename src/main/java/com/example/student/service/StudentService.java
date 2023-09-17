package com.example.student.service;

import com.example.student.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    void deleteStudentById(Long id);
}
