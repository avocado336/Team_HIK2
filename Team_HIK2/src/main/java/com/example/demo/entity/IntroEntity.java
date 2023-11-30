package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

public class IntroEntity {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	@Column(name = "introduction_id")
	public String introductionId;
	
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
	private Date createDate;
	
	@Column(name = "updated_at")
	private Date cDate;
	
	
}
