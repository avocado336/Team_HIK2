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
public class Introduction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "introduction_id")
	private Integer introductionId;
	
	@Column(name = "user_id")
	private String userId;
	
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
	private String createdAt;
	
	@Column (name = "updated_at")
	private String updatedAt;
}
