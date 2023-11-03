package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Introduction;

@Repository
public interface IntroductionRepository  extends JpaRepository<Introduction, Integer>{

}
