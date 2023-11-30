package com.example.demo.authentication;
//package com.example.demo.authentication;
//
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.stereotype.Component;
//
//import lombok.RequiredArgsConstructor;
//
//@Component
//@RequiredArgsConstructor
//public class UserDetailsServiceImpl implements UserDetailsService {
//	
//	/**
//	 * ユーザー情報生成
//	 * 
//	 * @Param username ログインID
//	 * @throws UsernameNotFoundException 
//	 */
//};

//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UserDetailsServiceImpl {
//	public String getUsername() {
//		
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		
//		if(authentication != null) {
//			Object principal = authentication.getPrincipal();
//			
//			if (principal instanceof UserDetails) {
//                // UserDetailsオブジェクトから、ユーザ名を取得
//                return ( (UserDetails) principal ).getUsername();
//            }
//		}
//		return null;
//		
//	}
//
//}
