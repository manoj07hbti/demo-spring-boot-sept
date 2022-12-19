package com.example.demospringbootsept.repository;

import com.example.demospringbootsept.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student,Long> {

    public Student findByRollNo(long rollno);

    public Student findByName(String name);

    public Student findByNameAndRollNo(String name, long roll_no);


    @Query(value = "SELECT * FROM STUDENT_SEPT_JAVA  WHERE STUDENT_NAME = :name and roll_no= :roll_no", nativeQuery = true)
    public Student nativeQuery(@Param("name") String name,@Param("roll_no") long roll_no);

}
