package com.example.demo.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.form.RegisterForm;
import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

/**
 * ユーザー登録画面 Service
 * 
 * @author grang
 *
 */

@Service
@RequiredArgsConstructor
public class RegisterService{

	// ユーザー情報テーブルDAO
	private final UserRepository userRepository;

	// PasswordEncoder
	private final PasswordEncoder passwordEncoder;

	/**
	 *  ユーザー情報テーブル 主キー検索
	 *  
	 *  @Param loginId 入力情報
	 *  @return 登録情報（ユーザー情報Entity）、すでに同じユーザーIDで登録がある場合はEmpty
	 */

	public Optional<UserEntity> registUserEntity(RegisterForm form) {
		var userEntityExistedOpt = userRepository.findById(form.getUserId());
		if(userEntityExistedOpt.isPresent()) {
			return Optional.empty();
		}

		Date now = new Date();
		var userEntity = new UserEntity();
		userEntity.setUserId(form.getUserId());
		userEntity.setEmail(form.getEmail());
		userEntity.setPassword(form.getPassword());
		userEntity.setCreateDate(now);

		var encodedPassword = passwordEncoder.encode(form.getPassword());
		userEntity.setPassword(encodedPassword);

		return Optional.of(userRepository.save(userEntity));

	}

}