package com.example.demo.controller;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.constant.MessageConst;
import com.example.demo.form.RegisterForm;
import com.example.demo.service.UserService;
import com.example.demo.util.AppUtil;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RegisterController {
	
	// ログイン画面（service)
		private final UserService service;
		
		/** メッセージソース*/
		private final MessageSource messageSource;
		
		/**
		 * 初期表示
		 * 
		 * @param model モデル
		 * @param form 入力情報
		 * @return 表示画面
		 */	
		
		// 新規会員登録画面の表示
		@GetMapping("/register")
		public String login(Model model, RegisterForm form) {
			return "register";
		}
		
		/**
		 * 新規会員登録
		 * 
		 * @param model モデル
		 * @param form 入力情報
		 * @return 
		 * @return 表示画面
		 */	
		
		@PostMapping("top2")
		public String register(Model model,RegisterForm form) {
			var userEntityOpt = service.registUserEntity(form);
			if(userEntityOpt.isEmpty()) {
				var errorMsg = AppUtil.getMessage(messageSource, MessageConst.REGISTER_EXISTED_LOGIN_ID);
				model.addAttribute("message",errorMsg);
				return "register";
			} else {
				var message = AppUtil.getMessage(messageSource, MessageConst.REGISTER_RESIST_SUCCEED);
				model.addAttribute("message",message);
				return "redirect:/top2";
			}
		}
		
		
		// 新規会員画面から会員登録後トップ画面に遷移する
//		@GetMapping(UrlConst.TOP2)
//		public String login2(Model model,RegisterForm form) {
//			service.registUserInfo(form);
//			return "top";
//		}	
//		// 新規会員画面から会員登録後トップ画面に遷移する
//		@GetMapping(UrlConst.TOP2)
//		public String top2() {
//			return "top";
//		}
		
		
		// 新規会員登録画面からログイン画面に遷移する
		@GetMapping("/login2")
		public String topScreen() {
			return "login";
		}

}
