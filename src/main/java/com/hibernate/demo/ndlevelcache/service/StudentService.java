package com.hibernate.demo.ndlevelcache.service;

import com.hibernate.demo.ndlevelcache.model.Student;
import com.hibernate.demo.ndlevelcache.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getById(Long id) {

        studentRepository.findById(id).get();

        return studentRepository.findById(id).get();
    }

    public Optional<Student> getByName(String name) {

        studentRepository.findByName(name);

        return studentRepository.findByName(name);
    }
}
