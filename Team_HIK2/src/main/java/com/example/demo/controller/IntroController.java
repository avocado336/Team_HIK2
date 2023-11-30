package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.IntroEntity;
import com.example.demo.repository.IntroRepository;
import com.example.demo.service.IntroService;

@Controller
public class IntroController {
	
	@Autowired
	IntroService service;
	IntroRepository repository;
	
	
	// 前項のTOP画面から遷移した際にDBに登録されているすべてのIDと名前を表示させる
	@GetMapping("/intro_move")
	public String IntroList1(Model model) {
		List<IntroEntity> introlist = service.findAll();
		model.addAttribute("IntroList",introlist);
//		Sort sort = Sort.by(Direction.ASC,"userId");
//		List<Book> introlist = repository.findAll(sort);
//		model.addAttribute("IntroList",introlist);
		return "introduction";
		}
		
		// retun"introduction"までがいるやつ
//		List<Book> introlist = service.findAll();
//		model.addAttribute("IntroList",introlist);
//		return "introduction";	
	
	// テーブルからuserIDを押した際にそれに該当する値を返して詳細画面に遷移
	@GetMapping("/details_move")
	public String IntroList2(@RequestParam("userId")String userId,Model model) {
//		int userId2 = Integer.parseInt(userId);
//		List<Book> detailslist = service.findByuserIdAndName(userId2,name);
		Optional<IntroEntity> detailslist1 = service.findByuserId(userId);
		IntroEntity detailslist2 = detailslist1.get();
//		List<Book> introlist = service.findAll(int user_id,String name);
		model.addAttribute("DetailsList",detailslist2);
//		System.out.println(detailslist2);
		return "details";
	}
//	
//	@GetMapping("/details_move")
//	public String IntroList2(@PathVariable(value = "${detailslist.userId}") int userId,Model model) {
//		Optional<Book> detailslist = service.findByuserId(userId);
//		model.addAttribute("DetailsList",detailslist);
//		return "details";
//	}
	
	// 詳細画面から「戻る」或いは「削除」ボタンを押した後に遷移してくる
	@GetMapping("/introduction_move")
	public String IntroList3(Model model) {
		List<IntroEntity> introlist = service.findAll();
		model.addAttribute("IntroList",introlist);		
		return "introduction";
	}
	
	// 編集ボタンをクリックした際に入力画面に遷移する
	@GetMapping("/input2_move")
	public String IntroList4(Model model) {
		return "input";
	}
	
	// 削除ボタンを押した際にテーブルにある情報を削除する（詳細画面)
//	@GetMapping("/book-delete")
//	public String delete(Model model, @RequestParam("userId") String userId) {
//	  service.deleteByuserId(userId);
//	  return "redirect:/introduction_move";
//	}
	
	// 削除ボタンを押した際に画面上に表示されているデータをDBから削除する動作
	@GetMapping("/book-delete")
	public String delete(Model model, @ModelAttribute IntroEntity Book) {
	  service.deleteByuserId(Book.getUserId());
	  // その後リダイレクト処理で一覧画面に遷移する
	  return "redirect:/introduction_move";
	}	
	
	
//	@GetMapping("/book-delete")
//	public String delete(Model model, Book Book) {
//	  service.deleteByuserId(Book.getUserId());
//	  return "redirect:/introduction_move";
//	}	
	
	
//	@GetMapping("/book-delete")
//	public String delete(@RequestParam("id") String userId, Model model,
//			RedirectAttributes redirectAttributes) {
//		service.deleteByuserId(userId);
//		return "redirect:/introduction_move";
//	}
	
//	@GetMapping("/book-delete")
//	public String Delete(@RequestParam("userId") String userId, Model model) {
//		service.deleteByuserId(userId);
//		return "redirect:/introduction_move";
//	}
	
//	@GetMapping("/book-delete")
//	public String Delete(Model model, String userId) {
//		Optional<Book> detaillist = service.deleteAll(userId);
//		model.addAttribute("DetailsList",detaillist);		
//		return "redirect:/introduction_move";
//	}
	
}
