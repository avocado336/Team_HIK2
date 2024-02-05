package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.example.demo.model.Introduction;
import com.example.demo.repository.IntroductionRepository;

public class IntroService {
	
	@Autowired
	IntroductionRepository repository;
	
	// ユーザー全検索
	public List<Introduction> findAll() {
		return repository.findAll(Sort.by(Sort.Direction.ASC, "userId"));
	}
	
	// useridを指定して検索
	public Optional<Introduction> findByuserId(String userId) {
		return repository.findByuserId(userId);
	}

//	// 中に登録されているデータを取消
//	public void deleteByuserId(String userId) {
////		Book userId2 = findById(userId);
//		// IDを指定して、データベースからデータを取消する
//		repository.deleteByuserId(userId);
//	}
	
	public void deleteByuserId(String userId) {
//		Optional<Book> userId2 = findByuserId(userId);
		repository.deleteByuserId(userId);
	} 
//	public Optional<Book> deleteAll() {
//		return repository.deleteAll(userId);
//	}

}
