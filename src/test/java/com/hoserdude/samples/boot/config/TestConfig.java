package com.hoserdude.samples.boot.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("unit-test")
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class TestConfig {

    @Bean
    public DogeRepository dogeRepository() {
        return new TestDogeRepository();
    }
}
