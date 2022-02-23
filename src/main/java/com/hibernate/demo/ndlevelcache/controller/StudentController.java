package com.hibernate.demo.ndlevelcache.controller;

import com.hibernate.demo.ndlevelcache.model.Student;
import com.hibernate.demo.ndlevelcache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {

        return studentService.getById(id);
    }

    @GetMapping
    public Optional<Student> getByName(@RequestParam String name) {

        return studentService.getByName(name);
    }
}
