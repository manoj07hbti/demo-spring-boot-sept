package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.Engineer_m;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Engineer_r extends JpaRepository<Engineer_m, Integer> {

}
