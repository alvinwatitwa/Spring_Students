package com.example.CrudRestfulAPI.repository;

import com.example.CrudRestfulAPI.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
