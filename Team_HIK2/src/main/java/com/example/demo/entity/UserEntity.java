package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報テーブル Entity
 * 
 * @author grang
 *
 */

@Data
@Entity
@Table(name = "users")
//@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
public class UserEntity {

	// ユーザーID
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@Column(name = "user_id")
	private String userId;
	
	// メールアドレス
	@Column(name = "email")
	private String email;
	
	// パスワード
	@Column(name = "password")
	private String password;
	
	// 登録日
	@Column(name = "created_at")
	private Date createDate;
	}