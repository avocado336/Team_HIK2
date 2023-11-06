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
	
	@GetMapping("/intro_list")
	public String IntroList(Model model) {
		
//		String sql = "SELECT * FROM introduction";	
//		List<Map<String,Object>> introlist = JdbcTemplate.queryForList(sql);
		List<Book> introlist = service.findAll();
		model.addAttribute("IntroList",introlist);
		return "introduction";
		
//		List<Book> booklist = service.findAll();
//		model.addAttribute("introduction", booklist);
//		return "test123";
		
	}
	
	@GetMapping("/intro_move")
	public String intro() {
		return "introduction";
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
