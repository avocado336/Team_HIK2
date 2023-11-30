package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.IntroEntity;

@Repository
public interface IntroRepository extends JpaRepository<IntroEntity, String> {	
//	List<Book> findByUserId(String userId, Sort sort);
		
//	  // select * from entity where name = 'xxx' order by position asc と同等
//	  List<Book> findByNameOrderByPosition(String userId);
//
//	  // select * from entity order by position と同等
//	  // findAllOrderByPositionでは駄目
//	  List<Book> findAllByOrderByPosition(String userId);

	
	 Optional<IntroEntity> findByuserId(String userId);

//	 Optional<Book> deleteAll(String userId);

	void deleteByuserId(String userId);
}