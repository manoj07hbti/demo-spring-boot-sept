package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Engineer_Repository extends JpaRepository<Engineer,Integer> {
}
