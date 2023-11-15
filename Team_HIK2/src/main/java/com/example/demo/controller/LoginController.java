package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class LoginController {
	
//	@Autowired
//	private HttpSession session;
	
	// ログイン画面の表示
	@GetMapping("/login1_move")
	public String login() {
		return "login";
	}	
	
//	@GetMapping(UrlConst.LOGIN1)
//	public String register(Model model,LoginForm form) {
////	public String userRegistration(Model model,LoginForm form,BindingResult result) {
////		if(result.hasErrors()) {
////			return "login";
////		}
//		return "register";
//	}

	// ログイン画面からログインが完了した後にTOP画面に遷移する
	@GetMapping("top1_move")
	public String top1() {
		System.out.println("aaaaaaaa");
		return "top";
	}
 	
	// ログイン画面から新規会員登録画面に遷移する
	@GetMapping("/register_move")
	public String register() {
		return "register";
	}
	

//	@Controller
//	public class AccountController {
//		@GetMapping("/user/registration")
//			return "user-registration";
//		}
//	}
	
	
//	@Autowired
//	private UserDetailsServicelmpl userDetailsService;
	
//	// 登録をするボタンを押した際に新規会員登録画面へ遷移
//	@GetMapping(UrlConst.REGISTER)
//	public String register() {
////		model.addAttribute("user", new User());
//		return "register";
//	}
	
//	
//	 // ログイン画面でエラー（DBに存在しないデータを入力した場合）
//	@GetMapping(value = UrlConst.LOGIN1,params = "error")
//	public String loginError(Model model,LoginForm form) {
//		var errorInfo =(Exception) session.getAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
//		model.addAttribute("errorMsg",errorInfo.getMessage());
//		return "login";
//	}
//	
//	// ログインが成功したとき
//	@GetMapping(UrlConst.LOGIN1)
//	public String login2(Model model,LoginForm form) {
//		var userInfo = service.serchUserById(form.getUserId());
//		var isCorrectUserAuth = userInfo.isPresent()
//				&& passwordEncoder.matches(form.getPassword(),userInfo.get().getPassword());
//	if(isCorrectUserAuth) {
//		return "top";
//	} else {
//		var errorMsg = AppUtil.getMessage(messageSource,ErrorMessageConst.LOGIN_WRONG_INPUT);
//		model.addAttribute("errorMsg", errorMsg);
//		return "redirect:/login1_move";
//	}
//	}
	

	
	// 新規会員画面から会員登録後トップ画面に遷移する
	@GetMapping("/top2_move")
	public String top2() {
		return "top";
	}
	
	// 新規会員登録画面からログイン画面に遷移する
	@GetMapping("/login2_move")
	public String topScreen() {
		return "login";
	}
	
	// 入力画面（TOP画面から「登録に進む」を押した際に遷移する入力画面
	@GetMapping("/input_move")
	public String input() {
		return "input";
	}
}
	


