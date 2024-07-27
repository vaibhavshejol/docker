package com.bnt.dockerdemo.repository;

import com.bnt.dockerdemo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
