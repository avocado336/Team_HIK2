package com.example.demo.authentication;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceImp {
	public String getUsername() {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if(authentication != null) {
			Object principal = authentication.getPrincipal();

			if (principal instanceof UserDetails) {
				// UserDetailsオブジェクトから、ユーザ名を取得
				return ( (UserDetails) principal ).getUsername();
			}
		}
		return null;

	}
}
