package com.codingrecipe.anonymousvotebackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vote_options")
@Getter
@Setter
@NoArgsConstructor
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text; // 선택지 내용
    private int votes = 0; // 득표 수

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}