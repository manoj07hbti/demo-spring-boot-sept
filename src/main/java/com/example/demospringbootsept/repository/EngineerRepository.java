package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineerRepository extends JpaRepository<Engineer,Long> {
}
