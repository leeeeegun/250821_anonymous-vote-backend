package com.codingrecipe.anonymousvotebackend.controller;


import com.codingrecipe.anonymousvotebackend.entity.Vote;
import com.codingrecipe.anonymousvotebackend.service.VoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/votes")
@RequiredArgsConstructor
public class VoteController {

    private final VoteService voteService;

    @PostMapping
    public Vote createVote(@RequestBody Vote vote) {
        return voteService.saveVote(vote);
    }

    @GetMapping("/results/{questionId}")
    public Map<String, Long> getResults(@PathVariable Long questionId) {
        List<Vote> votes = voteService.getVotesByQuestion(questionId);
        return votes.stream().collect(Collectors.groupingBy(Vote::getSelectedOption, Collectors.counting()));
    }
}
