package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.constant.UrlConst;

@Controller
public class InputController {
//	@Autowired
//	InputService service;

//	
//	@GetMapping("/input")
//	public String input(Model model) {
//		model.addAttribute("into", new Introduction());
//		return "input";
//	}
	// 入力画面にて入力完了後「次へ」ボタンを押すと確認画面に遷移
	@GetMapping(UrlConst.INPUTCHECK)
	public String save() {
//		service.insert(into);
		return "inputCheck";
	}
	
	// 確認画面から戻るを押した際に入力画面に遷移
	@GetMapping(UrlConst.INPUT3)
	public String save2() {
		return "input";
	}
	
	// 確認画面にて確認後「完了」ボタンを押すと登録完了画面に遷移
	@GetMapping(UrlConst.ENDSCREEN)
	public String end() {
		return "endScreen";
	}
	
	// 登録完了画面にて「TOPに戻る」を押すとトップ画面に遷移
	@GetMapping(UrlConst.TOP3)
	public String top2() {
		return "top";
	}
}
