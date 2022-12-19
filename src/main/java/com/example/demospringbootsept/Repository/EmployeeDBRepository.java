package com.example.demospringbootsept.Repository;

import com.example.demospringbootsept.model1.Employee_1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDBRepository extends JpaRepository <Employee_1, Integer> {
}
