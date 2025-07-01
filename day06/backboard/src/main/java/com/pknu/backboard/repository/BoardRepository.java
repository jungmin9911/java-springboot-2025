package com.pknu.backboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pknu.backboard.entity.Board;
import java.util.List;


public interface BoardRepository extends JpaRepository<Board, Long>{    // Board 뒤에 PK 값
    // 부가적인 기능이 더 필요
    Board findByTitle(String title); // 제목으로 검색
    List<Board> findByTitleLike(String title);  // 비슷한 제목으로 검색
}
