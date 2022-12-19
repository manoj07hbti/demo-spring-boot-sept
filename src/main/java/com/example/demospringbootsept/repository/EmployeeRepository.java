package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}
