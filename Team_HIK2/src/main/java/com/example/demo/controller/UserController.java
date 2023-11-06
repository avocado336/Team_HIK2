package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;

	@GetMapping("/loginScreen")
	public String signUp() {
		return "loginScreen";
	}

	@GetMapping("/signUp")
	public String signUp(Model model) {
		//		List<User> userlist = service.findAll();
		model.addAttribute("user", new User());
		return "signUp";
	}

	//	@GetMapping("/topScreen")
	//	public String saveUser(@ModelAttribute User user, Model model) {
	//
	//		// serviceクラスのinsertメソッドを呼び出し、DBに入力値を登録
	//		service.insert(user);
	//		return "topScreen";
	//	}

	@GetMapping("/topScreen")
	public String topScreen() {
		return "topScreen";
	}

}
