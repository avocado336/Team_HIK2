package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * SpringSecurityを利用するための設定クラス
 * ログイン処理でのパラメータ、画面遷移や認証処理でのデータアクセス先を設定する
 */
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig {
//	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		
		/**
		 * ログイン時に起動するURLの指定 
		 * ユーザーIDのname属性の指定
		 */
		http.formLogin(login -> login.loginPage("/login1").usernameParameter("userId").defaultSuccessUrl("/top2"));
		
		/**
		 * URL認証設定
		 */
		
//		http.authorizeHttpRequests((requests) -> requests
//			    .requestMatchers("/login1", "register", "/user/create","/css/**").permitAll()
//			    .anyRequest().authenticated());
		
		return http.build();
		
	}
	// フォームのパスワードをハッシュ化
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}   	
}


//URLの認証設定//		.authorizeHttpRequests(authorize -> authorize
//.requestMatchers("/login1","/login2","/register","/img/**","/css/**").permitAll()
//.anyRequest().authenticated()
//
//);