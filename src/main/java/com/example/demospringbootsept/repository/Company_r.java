package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.Company_m;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Company_r extends JpaRepository<Company_m,String> {
   // public List<Company_m> findAllByList_priceGreaterThan(int num);
}
