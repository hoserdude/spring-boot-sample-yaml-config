package com.hoserdude.samples.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SuchApplication implements CommandLineRunner {

	@Autowired
	private DogeService dogeService;

	@Override
	public void run(String... args) {
		System.out.println("AutoConfiguration should have wired up our stuff");
        System.out.println("Let's see if we are doge-worthy...");
        if (dogeService.requiresDogeness()) {
            System.out.println(dogeService.leDoge());
        } else {
            System.out.println("No Doge for us :(");
        }
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SuchApplication.class, args);
	}
}
