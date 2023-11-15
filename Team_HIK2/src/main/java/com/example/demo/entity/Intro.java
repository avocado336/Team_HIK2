package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "introduction")
@AllArgsConstructor
@NoArgsConstructor

public class Intro {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	@Column(name = "introduction_id")
	public Integer introduction_id;
	
	@Column(name = "user_id")
	public String userId;
		
	@Column(name = "name")
	public String name;
	
	@Column(name = "kana")
	public String kana;
	
	@Column(name = "gender")
	public String gender;
	
	@Column(name = "hobby")
	public String hobby;
	
	@Column(name = "word")
	public String word;
	
	@Column(name = "created_at")
	public String created_at;
	
	@Column(name = "updated_at")
	public String updated_at;
	
	
}
