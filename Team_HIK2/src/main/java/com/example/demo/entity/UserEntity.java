package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 * ユーザーテーブル
 *
 */

@Data
@Entity
@Table(name = "users")
public class UserEntity {

	// ユーザーID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	private String created_at;
	}