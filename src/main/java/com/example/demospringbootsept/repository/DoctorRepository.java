package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.Doctor_SQL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor_SQL,Long> {
}
