package com.jung.ex2.repository;

import com.jung.ex2.entity.Memo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    Page<Memo> findByMnoBetween(Long from, Long to, Pageable pageable);
}
