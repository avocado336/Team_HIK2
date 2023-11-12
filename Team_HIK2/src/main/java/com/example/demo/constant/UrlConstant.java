package com.example.demo.constant;

public class UrlConstant {
	// ログイン画面
	public static final String LOGIN1 = "/loginScreen";

	// 新規会員登録画面
	public static final String REGISTER = "/signUp";

	// ログイン画面（新規会員登録画面から戻るボタンで遷移するログイン画面）
	public static final String LOGIN2 = "/loginScreen2";

	// TOP画面（ログイン画面からログインが完了した後に遷移するTOP画面）
	public static final String TOP1 = "/topScreen";

	// TOP画面（新規会員登録画面から登録が完了した後に遷移するTOP画面）
	public static final String TOP2 = "/topScreen2";

	// 入力画面（TOP画面から「登録に進む」を押した際に遷移する入力画面
	//	public static final String INPUT = "/input_move";

	// 一覧画面
	//	public static final String INTRODUCTION1 = "/intro_move";

	// 詳細画面
	//	public static final String DETAILS = "/details_move";

	// 一覧画面（詳細画面から「戻る」或いは「削除」の後に遷移する一覧画面）
	//	public static final String INTRODUCTION2 = "/introduction_move";

	// 入力画面（詳細画面から「編集」を押した際に遷移する入力画面）
	//	public static final String INPUT2 = "/input2_move";

	// 確認画面
	//	public static final String INPUTCHECK = "/inputCheck_move";

	// 入力画面（確認画面から「戻る」を押した際に遷移する入力画面）
	//	public static final String INPUT3 = "/input3_move";

	// 登録完了画面
	public static final String ENDSCREEN = "/endScreen";

	// TOP画面（登録完了画面にてTOP画面に戻るを押した際に遷移する）
	public static final String TOP3 = "/topScreen3";

	// 認証不要画面
	public static final String[] NO_AUTHENTICATION = {LOGIN1,REGISTER,"/img/**","/static/**"};
}