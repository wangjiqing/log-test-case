package com.sakura.logtestcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LogTestCaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogTestCaseApplication.class, args);
    }
}
