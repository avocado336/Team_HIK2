package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Introduction;
import com.example.demo.service.InputService;

@Controller
public class InputController {
	@Autowired
	InputService service;

	
	@GetMapping("/input")
	public String input(Model model) {
		model.addAttribute("into", new Introduction());
		return "input";
	}

	@PostMapping("/inputCheck")
	public String save(@ModelAttribute Introduction into, Model model) {
		service.insert(into);
		return "inputCheck";
	}
}
