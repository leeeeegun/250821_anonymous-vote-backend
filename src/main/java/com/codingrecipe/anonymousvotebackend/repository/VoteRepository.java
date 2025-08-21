package com.codingrecipe.anonymousvotebackend.repository;

import com.codingrecipe.anonymousvotebackend.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    List<Vote> findByQuestionId(Long questionId);
}
