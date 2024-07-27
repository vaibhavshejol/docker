package com.bnt.dockerdemo.controller;

import com.bnt.dockerdemo.entities.Student;
import com.bnt.dockerdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return  studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @DeleteMapping("/{id}")
    public Student deleteStudent(@PathVariable("id") int id){
        return studentService.deleteStudent(id);
    }

}
