package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	@GetMapping("/inputCheck_move")
	public String save() {
//		service.insert(into);
		return "inputCheck";
	}
	
	// 確認画面から戻るを押した際に入力画面に遷移
	@GetMapping("/input3_move")
	public String save2() {
		return "input";
	}
	
	// 確認画面にて確認後「完了」ボタンを押すと登録完了画面に遷移
	@GetMapping("/endScreen_move")
	public String end() {
		return "endScreen";
	}
	
	// 登録完了画面にて「TOPに戻る」を押すとトップ画面に遷移
	@GetMapping("/top3_move")
	public String top2() {
		return "top";
	}
}
