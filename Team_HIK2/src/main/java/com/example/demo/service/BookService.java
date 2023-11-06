package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookService {
	
	@Autowired
	BookRepository repository;
	
	public List<Book> findAll() {
		return repository.findAll();
	}

}
