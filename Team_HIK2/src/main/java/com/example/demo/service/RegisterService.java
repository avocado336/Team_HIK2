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
	
	// Dozer Mapper
//	private final Mapper mapper;
	
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
//	public String registUserEntity(Model model,RegisterForm form) {
//		var mapper = new DozerBeanMapper();
		
//		var userEntity =mapper.map(form, UserEntity.class);
		
		// ユーザーIDの入力値を受け取る
//		String userId = form.getUserId();
		
		// ユーザー登録があるかどうか判定
//		if(userRepository.existsByUserId(userId)) {
//			model.addAttribute("existsUserId", "このユーザーは登録済みです。");
//			return "register";
//		} else {	
			
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