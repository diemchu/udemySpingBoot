package com.fpt.springcoredemo.common;

import org.springframework.beans.factory.annotation.Configurable;


public class SwingCoach implements Coach {

    public SwingCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters s a warn up";
    }
}
