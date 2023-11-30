package com.example.demo.form;

import lombok.Data;

/**
 * ログイン画面 form
 * 
 * @author grang
 *
 */

@Data
public class LoginForm {
	
	// ユーザーID
	private String userId;
	
	// パスワード
	private String password;

}
