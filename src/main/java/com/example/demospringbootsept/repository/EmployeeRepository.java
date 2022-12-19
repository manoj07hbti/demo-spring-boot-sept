package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public Employee findByCode(Long code);

    public Employee findByName(String name);

    public Employee findByNameAndCode(String name, Long code);

    @Query(value="SELECT * FROM Employee_sept WHERE EMPLOYEE_NAME =:name AND code =:code", nativeQuery = true)
    public Employee nativeQuery(@Param("name") String name, @Param("code") Long code);

    @Query (value = "select * from Employee_sept where department= :department", nativeQuery = true)
    public List<Employee> getAllEmployee(@Param("department") String department);
}
