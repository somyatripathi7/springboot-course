package com.somya.springcoredemo.config;

import com.somya.springcoredemo.common.Coach;
import com.somya.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
