package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.Medicines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Medicine_Repository extends JpaRepository<Medicines,Integer> {
}
