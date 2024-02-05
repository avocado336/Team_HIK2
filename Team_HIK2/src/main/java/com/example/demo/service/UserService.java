package com.example.demo.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.form.RegisterForm;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
//@Transactional
public class UserService {
	
//	@Autowired
	private final UserRepository userRepository;
	
	private final PasswordEncoder passwordEncoder;

	// データベースよりフォーラム(掲示板)の一覧を取得
//	public List<User> findAll() {
//		return repository.findAll();
//	}
	
	public Optional<User> registUserEntity(RegisterForm form) {
		var UserExistedOpt = userRepository.findById(form.getUserId());
		if(UserExistedOpt.isPresent()) {
			return Optional.empty();
		}
		
		Date now = new Date();
		var userEntity = new User();
		userEntity.setUserId(form.getUserId());
		userEntity.setEmail(form.getEmail());
		userEntity.setPassword(form.getPassword());
		userEntity.setCreateDate(now);
		
		var encodedPassword = passwordEncoder.encode(form.getPassword());
		userEntity.setPassword(encodedPassword);
		
		return Optional.of(userRepository.save(userEntity));
		
	}

	// データベースに値を登録
//	public void insert(User user) {
//		userRepository.save(user);
//	}

}
