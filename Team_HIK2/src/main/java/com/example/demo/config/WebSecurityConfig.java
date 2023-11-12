package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.constant.UrlConst;

@EnableWebSecurity
@Configuration


public class WebSecurityConfig {
	
	// ユーザー名のname属性を別名でしてしてあげる
//	private final String USERNAME_PARAMETER = "userId";
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http
		.formLogin
		(login -> login.loginPage(UrlConst.LOGIN1) // 自作のログイン画面
				.usernameParameter("userId") // securityのデフォルト画面ではidがusernameになってるので自分のIDを指定する
				.defaultSuccessUrl(UrlConst.TOP1)); //spring securityはログイン後の画面はデフォルトで[index.html]になってるので自分のログイン後のhtmlの名前に変える
		
		http
		.authorizeHttpRequests(authorize -> authorize
//			.requestMatchers("/css/login.css").permitAll()
			.requestMatchers(UrlConst.NO_AUTHENTICATION).permitAll()
			.anyRequest().authenticated()
			
			);
			


		
		return http.build();
	}
}

//public WebSecurityCustomizer webSecurityCustomizer() {
//	  return web -> web.ignoring().antMatchers("/img/**", "/css/**", "/static/**"); // ←cssフォルダ以下の全てのファイルに対してセキュリティを無視する
//	}
//
//}


