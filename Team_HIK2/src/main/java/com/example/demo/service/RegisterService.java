//package com.example.demo.service;
//
//import org.apache.catalina.mapper.Mapper;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.form.RegisterForm;
//import com.example.demo.model.User;
//import com.example.demo.repository.UserRepository;
//
//@Service
//public class RegisterService {
//	
//	private final UserRepository repository;
//	
//	
//	// Dozer Mapperの実装
//	private final Mapper mapper;
//	
//	
//	// PasswordEncoder
//	private final PasswordEncoder passwordEncoder;
//	/**
//	 * 
//	 * 新規会員登録
//	 * @param form　登録画面/	 * @return userId情報をPKとした検索結果
//	 */
//	
//	public User registUserInfo(RegisterForm form) {
//		var userInfo = mapper.map(form,User.class);
//		
//		var encodedPassword = passwordEncoder.encode(form.getPassword());
//		((RegisterForm) userInfo).setPassword(encodedPassword);
//		
//		return repository.save(userInfo);
//	}
//}
