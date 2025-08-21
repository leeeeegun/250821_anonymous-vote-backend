package com.codingrecipe.anonymousvotebackend.service;


import com.codingrecipe.anonymousvotebackend.entity.Question;
import com.codingrecipe.anonymousvotebackend.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question getQuestion(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }
}
