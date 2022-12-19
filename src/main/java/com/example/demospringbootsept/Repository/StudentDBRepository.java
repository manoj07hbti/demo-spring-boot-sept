package com.example.demospringbootsept.Repository;

import com.example.demospringbootsept.model1.Student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDBRepository extends JpaRepository<Student1, Long> {
}
