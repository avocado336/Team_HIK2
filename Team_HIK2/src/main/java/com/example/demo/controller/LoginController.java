package com.example.demo.controller;

import org.springframework.context.MessageSource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.constant.MessageConst;
import com.example.demo.form.LoginForm;
import com.example.demo.service.LoginService;
import com.example.demo.util.AppUtil;

import lombok.RequiredArgsConstructor;

/**
 * ログイン画面コントローラー
 * 
 * @author grang
 *
 */

@Controller
@RequiredArgsConstructor
public class LoginController {

	//	@Autowired
	//	private HttpSession session;

	// ログイン画面の表示
	//	@GetMapping("/loginScreen")
	//	public String login() {
	//		return "loginScreen";
	//	}	

	// ログイン画面からログインが完了した後にTOP画面に遷移する
	//	@GetMapping("topScreen")
	//	public String top() {
	//		return "topScreen";
	//	}

	// ログイン画面から新規会員登録画面に遷移する
	//	@GetMapping("/signUp")
	//	public String signUp() {
	//		return "signUp";
	//	}

	/** ログイン画面 service*/
	private final LoginService service;

	/** PasswordEncoder */
	private final PasswordEncoder passwordEncoder;

	/** メッセージソース*/
	private final MessageSource messageSource;

	//	@Autowired
	//	private UserDetailsServicelmpl userDetailsService;
	/** セッション情報*/
	//	private final HttpSession session;

	/**
	 * 初期表示
	 * 
	 * @param model モデル
	 * @param form 入力情報
	 * @return 表示画面
	 */

	@GetMapping("/loginScreen")
	public String login(Model model,LoginForm form) {
		return "loginScreen";
	}

	// ログイン画面からログインが完了した後にTOP画面に遷移する
	@PostMapping("topScreen")
	public String topScreen(Model model,LoginForm form) {
		var userEntity = service.searchUserById(form.getUserId());
		// TODO パスワードはハッシュ化したものを使用する
		var isCorrectUserAuth = userEntity.isPresent() 
				&& passwordEncoder.matches(form.getPassword(),userEntity.get().getPassword());

		if(isCorrectUserAuth) {
			return "redirect:/topScreen2";
		} else {
			// TODO エラーメッセージはプロパティファイルで管理する
			var errorMsg = AppUtil.getMessage(messageSource,MessageConst.LOGIN_WRONG_INPUT);
			model.addAttribute("errorMsg",errorMsg);
			return "loginScreen";
		}
	}

	// 新規会員画面から会員登録後トップ画面に遷移する
	// リダイレクト先のURLに対応するGetメソッドを追加する
	@GetMapping("topScreen2")
	public String topScreen2(Model model) {
		// TOP画面に表示する内容をモデルに設定する
		return "topScreen";
	}

	// 新規会員登録画面からログイン画面に遷移する
	//	@GetMapping("/loginScreen2")
	//	public String topScreen() {
	//		return "loginScreen";
	//	}

	// 入力画面（TOP画面から「登録に進む」を押した際に遷移する入力画面
	//	@GetMapping("/input_move")
	//	public String input() {
	//		return "input";
	//	}
}