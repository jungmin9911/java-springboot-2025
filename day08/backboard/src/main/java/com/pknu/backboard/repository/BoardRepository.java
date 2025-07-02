package com.pknu.backboard.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pknu.backboard.entity.Board;


public interface BoardRepository extends JpaRepository<Board, Long>{    // Board 뒤에 PK 값
    // 부가적인 기능이 더 필요
    Board findByTitle(String title); // 제목으로 검색
    List<Board> findByTitleLike(String title);  // 비슷한 제목으로 검색
    Page<Board> findAll(Pageable pageable); 
    // Page 쳤을때 자동완성?으로 나오는 곳에서 오른쪽 끝에 org.어쩌고 적혀져있는 거 선택
}
