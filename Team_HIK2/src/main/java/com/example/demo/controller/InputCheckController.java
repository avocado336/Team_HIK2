package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Introduction;

@Controller
public class InputCheckController {
	
	@Autowired
	InputService service;
	
	@GetMapping(value = "inputCheck", params = "next")
	public String inputcheck() {
		return "inputCheck";
	}
	
	@PostMapping("/inputCheck")
	public String save(@ModelAttribute Introduction into, Model model) {
		service.insert(into);
		return "inputCheck";
	}

}
