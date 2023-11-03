package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Introduction;
import com.example.demo.repository.IntroductionRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class InputService {
	@Autowired
	IntroductionRepository repository;
	
	public List<Introduction> findAll(){
		return repository.findAll();
	}
	
	public void insert(Introduction form) {
		repository.save(form);
	}

}
