package com.codingrecipe.anonymousvotebackend.service;

import com.codingrecipe.anonymousvotebackend.entity.Vote;
import com.codingrecipe.anonymousvotebackend.repository.VoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VoteService {

    private final VoteRepository voteRepository;

    public Vote saveVote(Vote vote) {
        return voteRepository.save(vote);
    }

    public List<Vote> getVotesByQuestion(Long questionId) {
        return voteRepository.findByQuestionId(questionId);
    }
}
