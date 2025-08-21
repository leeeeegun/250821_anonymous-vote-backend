package com.codingrecipe.anonymousvotebackend.repository;

import com.codingrecipe.anonymousvotebackend.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
