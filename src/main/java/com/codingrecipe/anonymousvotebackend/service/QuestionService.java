package com.codingrecipe.anonymousvotebackend.service;


import com.codingrecipe.anonymousvotebackend.entity.Option;
import com.codingrecipe.anonymousvotebackend.entity.Question;
import com.codingrecipe.anonymousvotebackend.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    // 모든 질문 조회
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    // 질문 생성
    public Question createQuestion(Question question) {
        if (question.getOptions() != null) {
            for (Option option : question.getOptions()) {
                option.setQuestion(question);
            }
        }
        return questionRepository.save(question);
    }

    // 투표하기
    public Question vote(Long questionId, Long optionId) {
        Question question = questionRepository.findById(questionId).orElseThrow();
        for (Option option : question.getOptions()) {
            if (option.getId().equals(optionId)) {
                option.setVotes(option.getVotes() + 1);
            }
        }
        return questionRepository.save(question);
    }

    // 단일 질문 조회
    public Question getQuestionById(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    // 질문 삭제
    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}