package com.example.demo.controller;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.constant.MessageConst;
import com.example.demo.form.RegisterForm;
import com.example.demo.service.RegisterService;
import com.example.demo.util.AppUtil;

import lombok.RequiredArgsConstructor;

/**
 * 
 * 
 * @author grang
 *
 */

@Controller
@RequiredArgsConstructor
public class RegisterController {

	// ログイン画面（service)
	//	private final LoginService service;
	//	
	//	// PasswordEncoder
	//	private final PasswordEncoder passwordEncoder;
	private final RegisterService service;

	//	// メッセージソース
	//	private final MessageSource messageSource;
	/** メッセージソース*/
	private final MessageSource messageSource;

	//	// セッション情報
	//	public final HttpSession session;
	/**
	 * 初期表示
	 * 
	 * @param model モデル
	 * @param form 入力情報
	 * @return 表示画面
	 */	

	// 新規会員登録画面の表示
	@GetMapping("/signUp")
	public String loginScreen(Model model, RegisterForm form) {
		return "signUp";
	}

	/**
	 * 新規会員登録
	 * 
	 * @param model モデル
	 * @param form 入力情報
	 * @return 
	 * @return 表示画面
	 */	

	@PostMapping("topScreen2")
	public String signUp(Model model,RegisterForm form) {
		var userEntityOpt = service.registUserEntity(form);
		if(userEntityOpt.isEmpty()) {
			var errorMsg = AppUtil.getMessage(messageSource, MessageConst.REGISTER_EXISTED_LOGIN_ID);
			model.addAttribute("message",errorMsg);
			return "signUp";
		} else {
			var message = AppUtil.getMessage(messageSource, MessageConst.REGISTER_RESIST_SUCCEED);
			model.addAttribute("message",message);
			return "redirect:/topScreen2";
		}
	}

	// 新規会員登録画面からログイン画面に遷移する
	@GetMapping("/loginScreen2")
	public String topScreen() {
		return "loginScreen";
	}
}