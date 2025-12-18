package com.example.PracticeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PracticeProject.entity.Stuentity;

@Repository
public interface StudentRepository extends JpaRepository<Stuentity, Long> {
    
      
}