package com.example.demo.service;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

/*
 * 認証に使うユーザー情報の取得
 */

@Service
public class LoginService implements UserDetailsService {
	
	private final UserRepository userRepository;
	
	public LoginService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		// テーブルからレコードを抽出
		UserEntity userEntity = userRepository.findByUserId(userId);
//		Optional<UserEntity> userEntity = userRepository.findByUserId(userId);
		
		// 引数の値を空のリストとして保持（セキュリティの都合）
//		return new User(userEntity.get().getUserId(),userEntity.get().getPassword(),Collections.emptyList());
//	}
		return new User(userEntity.getUserId(),userEntity.getPassword(),Collections.emptyList());
	}
}

