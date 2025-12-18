package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    // private final StudentRepository studentRepository;
    // public StudentServiceImplement(StudentRepository studentRepository){
    //     this.studentRepository=studentRepository;
    // }
    @Autowired
    StudentRepository studentRepository;

    public StuEnt saveStudent(Stuentity student){
        return studentRepository.save(student);
    }
}