package com.toche.challenge.model;

import java.util.Collection;

public class Challenge {
    private static final double PASS_LIMIT = 87.5;

    private String question;
    private String answer;
    private boolean correct;

    public Challenge(String question, String answer, boolean correct) {
        this.question = question;
        this.answer = answer;
        this.correct = correct;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public static Boolean isPassing(Collection<Challenge> challenges) {
        if(challenges.isEmpty()) {
            return null;
        }

        int totalChallengeCount = challenges.size();
        int correctChallengeCount = 0;
        for (Challenge challenge: challenges) {
            if(challenge.isCorrect()) {
                correctChallengeCount++;
            }
        }

        double percentageCorrect = ((double) correctChallengeCount / totalChallengeCount) * 100.0;

        return percentageCorrect > PASS_LIMIT ? Boolean.TRUE : Boolean.FALSE;
    }

}
