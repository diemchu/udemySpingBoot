package com.fpt.springcoredemo.config;

import com.fpt.springcoredemo.common.Coach;
import com.fpt.springcoredemo.common.SwingCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return  new SwingCoach();
    }
}
