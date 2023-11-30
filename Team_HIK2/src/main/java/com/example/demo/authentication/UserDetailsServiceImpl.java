//package com.example.demo.authentication;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import com.example.demo.repository.UserRepository;
//
//import lombok.RequiredArgsConstructor;
//
//@Component
//@RequiredArgsConstructor
//
//public class UserDetailsServiceImpl implements UserDetailsService {
//	
//	
//	private final UserRepository repository;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		var userEntity = repository.findById(username)
//				.orElseThrow(() -> new UsernameNotFoundException(username));
//		
//		return User.withUsername(userEntity.getUserId())
//		.password(userEntity.getPassword())
//		.roles("USER")
//		.build();
//	}
//}
