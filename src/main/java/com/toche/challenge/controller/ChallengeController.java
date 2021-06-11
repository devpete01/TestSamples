package com.toche.challenge.controller;

import com.toche.challenge.interfaces.InterviewService;
import com.toche.challenge.model.Challenge;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/interviews")
public class ChallengeController {

    /*
    private final InterviewService interviewService;

    public ChallengeController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Challenge>> getChallenges(@PathVariable("id") String interviewId) {
        if (Objects.isNull(interviewId) || interviewId.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.TEXT_PLAIN).body(null);
        }
        List<Challenge> challenges = interviewService.getInterview(interviewId);

        return ResponseEntity.ok(challenges);
    }

     */

}
