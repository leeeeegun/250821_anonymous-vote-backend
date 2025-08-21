package com.codingrecipe.anonymousvotebackend.controller;


import com.codingrecipe.anonymousvotebackend.entity.Question;
import com.codingrecipe.anonymousvotebackend.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    // 전체 질문 조회
    @GetMapping
    public List<Question> getQuestions() {
        return questionService.getAllQuestions();
    }

    // 질문 생성
    @PostMapping
    public Question createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }

    // 투표하기
    @PostMapping("/{questionId}/vote/{optionId}")
    public Question vote(@PathVariable Long questionId, @PathVariable Long optionId) {
        return questionService.vote(questionId, optionId);
    }
}