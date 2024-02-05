package com.example.demo.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.form.InputForm;
import com.example.demo.model.Introduction;
import com.example.demo.repository.IntroductionRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class InputService {
	@Autowired
	private final IntroductionRepository introductionRepository;

//	public Optional<Introduction> searchIntroductionById(Integer introductionId) {
//		return introductionRepository.findById(introductionId);
//	}

	public Optional<Introduction> registIntroduction(InputForm inputForm) {
		Introduction intro = new Introduction();

		Date now = new Date();

		intro.setName(inputForm.getName());
		intro.setKana(inputForm.getKana());
		intro.setGender(inputForm.getGender());
		intro.setHobby(inputForm.getHobby());
		intro.setWord(inputForm.getMessage());
		intro.setCreateDate(now);
		intro.setUpdateDate(now);

//		User user = new User();
//		user.setUserId(inputForm.getUserId());
//		intro.setUser(user);

		return Optional.of(introductionRepository.save(intro));
	}

}
