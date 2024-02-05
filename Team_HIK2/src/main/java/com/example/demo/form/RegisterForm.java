package com.example.demo.form;

import lombok.Data;

@Data
public class RegisterForm {
	
	// ユーザーID
	private String userId;
	
	// メールアドレス
	private String email;
	
	// パスワード
	private String password;

	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
