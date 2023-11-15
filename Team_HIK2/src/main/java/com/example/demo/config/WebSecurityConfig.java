package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/*
 * SpringSecurityを利用するための設定クラス
 * ログイン処理でのパラメータ、画面遷移や認証処理でデータのアクセス先を設定する
 */
@EnableWebSecurity
@Configuration
public class WebSecurityConfig {


	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http
		.formLogin
		// ログイン時に起動するURLの指定
		(login -> login
				// ユーザ名、パスワードの送信先URL
//				.loginProcessingUrl("/login1")
				// ログイン画面のURL
				.loginPage("/login1_move")
				// ログインID（ユーザーID）のname属性の指定（デフォルトではusername(user)になっている）
				.usernameParameter("userId")
				// パスワードのname属性の指定（初期値もpasswordなので指定の必要は今回に限ってはなし）
				.passwordParameter("password")
				//spring securityはログイン後の画面はデフォルトで[index.html]になってるので自分のログイン後のhtmlの名前に変える	
				.defaultSuccessUrl("/top1_move")); 
	
//		http
		// URLの認証設定
//		.authorizeHttpRequests(authorize -> authorize
//				.requestMatchers("/login1_move","/login2_move","/register_move","/img/**","/css/**").permitAll()
//				.anyRequest().authenticated()
//			
//				);
//		
		return http.build();
	}
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//	}
	// フォームのPWをハッシュ化する
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}