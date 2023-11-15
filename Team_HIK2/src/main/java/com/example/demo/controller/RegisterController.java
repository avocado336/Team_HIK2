package com.example.demo.controller;

import org.springframework.stereotype.Controller;

/**
 * 
 * @author grang
 *
 */

@Controller
//@RequiredArgsConstructor
public class RegisterController {
	
	// ログイン画面（service)
//	private final LoginService service;
//	
//	// PasswordEncoder
//	private final PasswordEncoder passwordEncoder;
	
//	// メッセージソース
//	private final MessageSource messageSource;
	
//	// セッション情報
//	public final HttpSession session;
	
//	// 新規会員登録画面の表示
//	@GetMapping(UrlConst.REGISTER)
//	public String login1() {
//		return "register";
//	}
	
	// ログイン画面でエラー（DBに存在しないデータを入力した場合）
//	@GetMapping(value = UrlConst.LOGIN1,params = "error")
//	public String loginError() {
//		var errorInfo =(Exception) session.getAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
//		model.addAttribute("errorMsg",errorInfo.getMessage());
//		return "login";
//	}
	
	
	// 新規会員画面から会員登録後トップ画面に遷移する
//	@GetMapping(UrlConst.TOP2)
//	public String login2(Model model,RegisterForm form) {
//		service.registUserInfo(form);
//		return "top";
//	}	
//	// 新規会員画面から会員登録後トップ画面に遷移する
//	@GetMapping(UrlConst.TOP2)
//	public String top2() {
//		return "top";
//	}
	
	
//	// 新規会員登録画面からログイン画面に遷移する
//	@GetMapping("login2_move")
//	public String topScreen() {
//		return "login";
//	}
}