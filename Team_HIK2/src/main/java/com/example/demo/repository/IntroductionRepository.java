package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Introduction;

@Repository
public interface IntroductionRepository  extends JpaRepository<Introduction, String>{
//
//	Introduction findByIntroductionId(String introductionId);
//	boolean existsByIntroduction(String introductionId);
	
	 Optional<Introduction> findByuserId(String userId);
	 void deleteByuserId(String userId);
}
