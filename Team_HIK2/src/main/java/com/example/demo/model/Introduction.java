package com.example.demo.model;

import java.util.Date;

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
public class Introduction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "introduction_id")
	private Integer introductionId;
	
	// ここエラー
//	@OneToMany
//	@JoinColumn(name = "user_id")
//	private User user;

	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "kana")
	private String kana;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "hobby")
	private String[] hobby;
	
	@Column(name = "word")
	private String word;
	
	@Column(name = "created_at")
	private Date createDate;
	
	@Column (name = "updated_at")
	private Date updateDate;
}
