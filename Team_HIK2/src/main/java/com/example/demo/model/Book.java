package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "introduction")

public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name = "introduction_id")
	private String introduction_id;
	
	@Column(name = "user_id")
	private String user_id;
		
	@Column(name = "name")
	private String name;
	
	@Column(name = "kana")
	private String kana;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "hobby")
	private String hobby;
	
	@Column(name = "word")
	private String word;
	
	@Column(name = "created_at")
	private String created_at;
	
	@Column(name = "updated_at")
	private String updated_at;
	
	
}
