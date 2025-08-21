package com.codingrecipe.anonymousvotebackend.controller;


import com.codingrecipe.anonymousvotebackend.entity.Question;
import com.codingrecipe.anonymousvotebackend.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping
    public List<Question> getQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Question getQuestion(@PathVariable Long id) {
        return questionService.getQuestion(id);
    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }
}
