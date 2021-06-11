package com.toche.challenge.interfaces;

import com.toche.challenge.model.Challenge;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface InterviewService {

    /**
    * Looks up all [Challenge] associated with
    * an interview identified by id and returns
    * as a List.
    */
     List<Challenge> getInterview(String id);

}
