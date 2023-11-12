package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.constant.UrlConstant;

@Configuration
@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	private final UserDetailsService userDetailsService;
//
//	public SecurityConfig(UserDetailsService userDetailsService) {
//		this.userDetailsService = userDetailsService;
//	}
//
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.authorizeRequests()
//		.antMatchers("/topScreen").authenticated() // topScreenに認証が必要
//		.anyRequest().permitAll() // 他のリクエストは認証不要
//		.and()
//		.formLogin()
//		.loginPage("/loginScreen") // ログインページのURL
//		.defaultSuccessURL("/topScreen") // ログイン成功後のリダイレクトURL
//		.permitAll()
//		.and()
//		.logout()
//		.permitAll();
//	}

public class SecurityConfig {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http
		.formLogin
		(login -> login.loginPage(UrlConstant.LOGIN1) // 自作のログイン画面
				.usernameParameter("userId") // securityのデフォルト画面ではidがusernameになってるので自分のIDを指定する
				.defaultSuccessUrl(UrlConstant.TOP1)); //spring securityはログイン後の画面はデフォルトで[index.html]になってるので自分のログイン後のhtmlの名前に変える

		http
		.authorizeHttpRequests(authorize -> authorize
				//			.requestMatchers("/css/login.css").permitAll()
				.requestMatchers(UrlConstant.NO_AUTHENTICATION).permitAll()
				.anyRequest().authenticated()

				);


		return http.build();
	}
}
