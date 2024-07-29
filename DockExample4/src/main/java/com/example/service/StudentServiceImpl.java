package com.example.service;

import com.example.entities.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student deleteStudent(int id) {
        Student deletedStudent=studentRepository.findById(id).get();
        studentRepository.delete(deletedStudent);
        return deletedStudent;
    }
}
