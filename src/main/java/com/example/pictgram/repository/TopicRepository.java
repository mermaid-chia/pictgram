package com.example.pictgram.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pictgram.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
	//一覧取得メソッド
	List<Topic> findAllByOrderByUpdatedAtDesc();

	//検索用メソッド
	List<Topic> findByDescriptionContaining(String description);

	void deleteById(Long id); // 削除用メソッド

}
