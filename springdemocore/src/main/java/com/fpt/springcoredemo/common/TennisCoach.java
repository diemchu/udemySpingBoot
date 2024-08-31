package com.fpt.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//Chỉ có một instance duy nhất của bean được tạo
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Một instance mới của bean sẽ được tạo mỗi khi bean đó được yêu cầu từ container.
public class TennisCoach implements Coach{
    public TennisCoach() {
        System.out.println(getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    // define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff(): " +getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff(): " +getClass().getSimpleName());
    }
}
