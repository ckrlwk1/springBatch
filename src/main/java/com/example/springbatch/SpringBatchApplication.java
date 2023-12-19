package com.example.springbatch;

import org.springframework.batch.core.Job;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {
            // Spring Batch Job 이름 조회
            String[] jobNames = context.getBeanNamesForType(Job.class);
            System.out.println("Spring Batch Job Names:");
            System.out.println(jobNames.toString());
            for (String jobName : jobNames) {
                System.out.println("name: " + jobName);
            }
        };
    }

}
