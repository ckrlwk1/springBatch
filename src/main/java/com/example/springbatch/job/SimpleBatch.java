package com.example.springbatch.job;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.support.DefaultBatchConfiguration;
import org.springframework.batch.core.job.builder.JobBuilder;

import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.transaction.PlatformTransactionManager;

import java.util.List;

@Configuration
@EnableBatchProcessing

public class SimpleBatch  {

//    @Bean
//    public Job simpleJob1(JobRepository jobRepository, Step simpleStep1) {
//        System.out.println("simpleJob1-------");
//        return new JobBuilder("simpleJob", jobRepository)
//                .start(simpleStep1)
//                .build();
//    }
//    @Bean
//    public Step simpleStep1(JobRepository jobRepository, Tasklet testTasklet, PlatformTransactionManager platformTransactionManager){
//        System.out.println("simpleStep1-------");
//        return new StepBuilder("simpleStep1", jobRepository)
//                .tasklet(testTasklet, platformTransactionManager).build();
//    }
//    @Bean
//    public Tasklet testTasklet(){
//        return ((contribution, chunkContext) -> {
//            System.out.println(">>>>> This is Step1");
//            return RepeatStatus.FINISHED;
//        });
//    }


    // end

    // Job 정의
//    @Bean
//    @Scheduled(fixedRate = 60000)
//    public Job sampleJob(JobRepository jobRepository, Step sampleStep) {
//        return new JobBuilder("sampleJob", jobRepository)
//                .start(sampleStep)
//                .build();
//    }
//
//    // Step 정의
//    @Bean
//    public Step sampleStep(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
//        return new StepBuilder("sampleStep", jobRepository)
//                .<String, String>chunk(10, transactionManager)
//                .reader(itemReader())
//                .processor(itemProcessor())
//                .writer(itemWriter())
//                .build();
//    }
//
//    // ItemReader 구현체
//    private ItemReader<String> itemReader() {
//        System.out.println("itemReader--------------------");
//        return new ListItemReader<>(List.of("item1", "item2", "item3"));
//    }
//
//    // ItemProcessor 구현체
//    private ItemProcessor<String, String> itemProcessor() {
//        System.out.println("ItemProcessor-------------------- ");
//        return item -> "Processed " + item;
//    }
//
//    // ItemWriter 구현체
//    private ItemWriter<Object> itemWriter() {
//        System.out.println("ItemWriter--------------------");
//        return items -> items.forEach(item -> System.out.println(item.toString()));
//    }
}
