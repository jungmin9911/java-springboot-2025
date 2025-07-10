package com.pknu.backboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pknu.backboard.entity.About;

@Repository
public interface AboutRepository extends JpaRepository<About, Long>{
    // 기본이라서 추가메서드 필요없음
}
