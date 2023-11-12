package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
	UserRepository repository;

	// データベースよりフォーラム(掲示板)の一覧を取得
	public List<User> findAll() {
		return repository.findAll();
	}

	// データベースに値を登録
	//	public void insert(User user) {
	//		repository.save(user);
	//	}
	public void insert(User user) {
		if (repository.findByEmail(user.getEmail()) == null) {
			// Email does not exist, proceed with the insertion
			repository.save(user);
		} else {
			// Email already exists, handle accordingly
		}
	}

}