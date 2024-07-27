package com.bnt.dockerdemo.service;

import com.bnt.dockerdemo.entities.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student deleteStudent(int id);
}
