//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//
//import com.example.demo.form.InputForm;
//import com.example.demo.service.InputService;
//
//@Controller
//public class InputCheckController {
//	
//	@Autowired
//	InputService service;
//	
//	@GetMapping(value = "inputCheck", params = "next")
//	public String inputcheck() {
//		return "inputCheck";
//	}
//	
////	@PostMapping("/inputCheck")
////	public String save(@ModelAttribute Introduction into, Model model) {
////		service.insert(into);
////		return "inputCheck";
////	}
//	
//	@GetMapping("/inputCheck")
//	public String save(@ModelAttribute InputForm into, Model model) {
//		service.insert(into);
//		return "inputCheck";
//	}
//
//}
