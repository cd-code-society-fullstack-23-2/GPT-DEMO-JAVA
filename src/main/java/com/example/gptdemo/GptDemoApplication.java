package com.example.gptdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GptDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GptDemoApplication.class, args);
    }

    @Autowired
    private OpenAIService openAIService;

    @Override
    public void run(String... args) throws Exception {
        openAIService.getJoke();
    }
}
