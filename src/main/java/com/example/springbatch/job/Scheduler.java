package com.example.springbatch.job;

import com.example.springbatch.test.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.*;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import org.springframework.transaction.PlatformTransactionManager;

import java.util.HashMap;
import java.util.Map;

@Component
public class Scheduler {
    private static final Logger logger = LoggerFactory.getLogger(Scheduler.class);

    @Value("${spring.batch.job.names:NONE}")
    private String jobNames;

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private TestService testService;

    // 좋아요 안 눌린 그림 DB, S3로 부터 주기적으로 삭제하는 기능. 5시간으로 임의 설정
    @Scheduled(cron = "0 */1 * * * *")               // 초, 분, 시, 일, 월, 주 순서
    public void deleteImage() {
//        imageService.deleteImage();
        logger.info("tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt : " + jobNames);
        logger.info("----------------------------------------");
        testService.test();
//        runJob(jobNames);
    }
}
