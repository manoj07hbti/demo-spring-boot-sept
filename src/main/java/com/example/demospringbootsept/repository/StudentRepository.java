package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
