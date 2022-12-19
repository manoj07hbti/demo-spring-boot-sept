package com.example.demospringbootsept.Repository;

import com.example.demospringbootsept.model1.Doctor1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorDBRepository extends JpaRepository<Doctor1, Integer> {

}
