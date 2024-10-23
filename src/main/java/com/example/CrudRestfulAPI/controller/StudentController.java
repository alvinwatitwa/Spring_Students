package com.example.CrudRestfulAPI.controller;

import com.example.CrudRestfulAPI.entity.Student;
import com.example.CrudRestfulAPI.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentRepository.findById(id).get();
    }

    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

}
