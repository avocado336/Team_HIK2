package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.constant.UrlConst;

@Controller
public class LoginController {
	
	// ログイン画面の表示
	@RequestMapping(UrlConst.LOGIN1)
	public String login() {

		return "login";
	}
	
	// ログイン画面からログインが完了した後にTOP画面に遷移する
	@GetMapping(UrlConst.TOP1)
	public String top1() {
		return "top";
	}
 	
	// ログイン画面から新規会員登録画面に遷移する
	@GetMapping(UrlConst.REGISTER)
	public String register() {
		return "register";
	}
	
	// 新規会員画面から会員登録後トップ画面に遷移する
	@GetMapping(UrlConst.TOP2)
	public String top2() {
		return "top";
	}
	
	// 新規会員登録画面からログイン画面に遷移する
	@GetMapping(UrlConst.LOGIN2)
	public String topScreen() {
		return "login";
	}
	
	// 入力画面（TOP画面から「登録に進む」を押した際に遷移する入力画面
	@GetMapping(UrlConst.INPUT)
	public String input() {
		return "input";
	}
}
	


