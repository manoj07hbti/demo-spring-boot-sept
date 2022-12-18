package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
