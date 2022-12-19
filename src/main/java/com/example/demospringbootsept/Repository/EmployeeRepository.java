package com.example.demospringbootsept.Repository;

import com.example.demospringbootsept.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
