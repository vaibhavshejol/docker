package com.example.service;


import com.example.entities.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student deleteStudent(int id);
}
