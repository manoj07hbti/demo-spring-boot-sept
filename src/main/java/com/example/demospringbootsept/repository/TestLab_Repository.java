package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.TestLab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TestLab_Repository extends JpaRepository<TestLab,Long> {
    public TestLab findById(long id);
    public TestLab findByCity(String city);

    public TestLab findByName(String name);








}
