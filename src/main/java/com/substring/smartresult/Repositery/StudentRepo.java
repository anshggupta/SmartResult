package com.substring.smartresult.Repositery;

import com.substring.smartresult.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,String> {

    Student findByRollNumber(String rollNumber);
}
