package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.InputForm;
import com.example.demo.service.InputService;

@Controller
public class InputController {
	@Autowired
	public InputService service;

	
	@GetMapping("/input")
	public String input(Model model) {
		List<String> genderList = new ArrayList<>();
		genderList.add("男");
		genderList.add("女");
		List<String> hobbyList = new ArrayList<>();
		hobbyList.add("映画");
		hobbyList.add("スポーツ観戦");
		hobbyList.add("読書");
		hobbyList.add("食べ歩き");
		hobbyList.add("旅行");
		hobbyList.add("ゲーム");
		hobbyList.add("お絵かき");
		hobbyList.add("犬と遊ぶ");
		hobbyList.add("音楽");
		model.addAttribute("radioGender", genderList);
		model.addAttribute("checkHobby", hobbyList);
		model.addAttribute("into", new InputForm());
		return "input";
	}
	
	@GetMapping("/inputCheck")
	public String inputCheck(Model model) {
		model.addAttribute("inputCheck", new InputForm());
		return "inputCheck";
	}

	@PostMapping("/input")
	public String save(@ModelAttribute InputForm into, Model model) {
		service.registIntroduction(into);
		return "input";
	}
}
