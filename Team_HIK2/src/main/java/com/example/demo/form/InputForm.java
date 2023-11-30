package com.example.demo.form;

import lombok.Data;

/**
 * 自己紹介登録画面 form
 * 
 * @author grang
 *
 */

@Data
public class InputForm {
	
	// 名前
	private String name;
	
	// カタカナ
	private String kana;
	
	// 性別
	private String gender;
	
	// 趣味
	private String hobby;
	
	// 一言
	private String word;

}