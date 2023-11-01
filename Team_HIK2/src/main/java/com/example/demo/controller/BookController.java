package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping("/user_list")
	public String UserList(Model model) {
		
		List<Book> booklist = service.findAll();
		model.addAttribute("introduction", booklist);
		return "test123";
		
	}
	
	@GetMapping("/details_move")
	public String details() {
		return "details";
	}
	
	@GetMapping("/introduction_move")
	public String introduction() {
		return "introduction";
	}

}
