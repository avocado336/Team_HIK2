package com.example.demo.service;

import java.util.Collections;
import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginService implements UserDetailsService{
	
	// ユーザー情報テーブルDAO
	private final UserRepository userRepository;
	
	
	/**
	 * ユーザー情報テーブル 主キー検索
	 * @param userId ユーザーID
	 * @return ユーザー情報テーブルを主キー検索した結果（1件）
	 */
	public Optional<com.example.demo.model.User> searchUserById(String userId){
		return userRepository.findById(userId);
	}
	
//	public LoginService(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		// テーブルからレコードを抽出
		com.example.demo.model.User userEntity = userRepository.findByUserId(userId);
//		Optional<UserEntity> userEntity = userRepository.findByUserId(userId);
		
		// 引数の値を空のリストとして保持（セキュリティの都合）
//		return new User(userEntity.get().getUserId(),userEntity.get().getPassword(),Collections.emptyList());
//	}
		return new User(userEntity.getUserId(),userEntity.getPassword(),Collections.emptyList());
	}

}
