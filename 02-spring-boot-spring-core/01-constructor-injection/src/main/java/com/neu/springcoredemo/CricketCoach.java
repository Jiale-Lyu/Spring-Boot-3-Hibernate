package com.neu.springcoredemo;

import org.springframework.stereotype.Component;

@Component
//Component annotation marks the class as a Spring Bean, makes it available for dependency injection
public class CricketCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins!!!!!!!!";
    }
}
